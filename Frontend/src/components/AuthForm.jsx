import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export default function AuthForm({ type }) {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const isLogin = type === 'login';

  const handleSubmit = (e) => {
    e.preventDefault();
    // TODO: connect to API
    console.log(`${isLogin ? 'Logging in' : 'Signing up'} with`, email, password);
    navigate('/');
  };

  return (
    <div className="max-w-sm mx-auto mt-20 p-6 border rounded shadow">
      <h2 className="text-2xl font-semibold mb-4">{isLogin ? 'Login' : 'Sign Up'}</h2>
      <form onSubmit={handleSubmit} className="space-y-4">
        <input
          className="w-full px-3 py-2 border rounded"
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
        <input
          className="w-full px-3 py-2 border rounded"
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <button
          className="w-full bg-blue-600 text-white py-2 rounded hover:bg-blue-700 transition"
          type="submit"
        >
          {isLogin ? 'Login' : 'Sign Up'}
        </button>
      </form>
    </div>
  );
}
