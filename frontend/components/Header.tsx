// components/Header.tsx

import Link from "next/link";

export default function Header() {
  return (
    <header className="w-full py-4 bg-white shadow-sm">
      <div className="max-w-5xl mx-auto flex items-center justify-between px-4">
        <Link href="/" className="text-xl font-bold">
          SimpleEC
        </Link>

        <nav className="flex gap-6 text-sm">
          <Link href="/" className="hover:underline">
            Home
          </Link>
          <Link href="/products" className="hover:underline">
            Products
          </Link>
          <Link href="/login" className="hover:underline">
            Login
          </Link>
        </nav>
      </div>
    </header>
  );
}
