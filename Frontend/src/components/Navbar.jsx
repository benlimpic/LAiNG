import { Link } from 'react-router-dom';

export default function Navbar() {
  return (
    <nav className="bg-gray-800 text-white px-6 py-4 flex justify-between items-center">
      <Link to="/" className="text-xl font-bold">MyApp</Link>
      <div className="space-x-4">
        <Link to="/" className="hover:underline">Home</Link>
        <Link to="/login" className="hover:underline">Login</Link>
        <Link to="/signup" className="hover:underline">Sign Up</Link>
      </div>
    </nav>
  );
}