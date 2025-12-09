"use client";

import { useState } from "react";

export default function LoginPage() {
  // TypeScript では useState の型を明示できる
  const [email, setEmail] = useState<string>("");
  const [password, setPassword] = useState<string>("");

  // フォーム送信時の型
  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    console.log("Email:", email);
    console.log("Password:", password);
  };

  return (
    <div className="flex justify-center items-center min-h-[60vh]">
      <div className="w-full max-w-sm bg-white p-8 rounded-xl shadow-md">
        <h1 className="text-2xl font-bold mb-6 text-center">Login</h1>

        <form onSubmit={handleSubmit} className="flex flex-col gap-4">
          <div>
            <label htmlFor="email" className="block text-sm font-medium mb-1">
              Email
            </label>
            <input
              id="email"
              type="email"
              className="w-full px-3 py-2 border rounded-md focus:outline-none focus:ring-2 focus:ring-black"
              placeholder="you@example.com"
              value={email}
              onChange={(e) => setEmail(e.target.value)} // ← TSで型が推論される
            />
          </div>

          <div>
            <label htmlFor="password" className="block text-sm font-medium mb-1">
              Password
            </label>
            <input
              id="password"
              type="password"
              className="w-full px-3 py-2 border rounded-md focus:outline-none focus:ring-2 focus:ring-black"
              placeholder="********"
              value={password}
              onChange={(e) => setPassword(e.target.value)} // ← これも型推論OK
            />
          </div>

          <button
            type="submit"
            className="w-full bg-black text-white py-2 rounded-md hover:bg-gray-800 transition"
          >
            Login
          </button>
        </form>
      </div>
    </div>
  );
}
