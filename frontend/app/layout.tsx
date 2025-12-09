import "./globals.css";
import Header from "../components/Header";

export const metadata = {
  title: "Simple EC",
  description: "Simple e-commerce portfolio",
};

export default function RootLayout({ children }: { children: React.ReactNode }) {
  return (
    <html lang="ja">
      <body className="min-h-screen bg-zinc-50">
        <Header />
        <main className="max-w-5xl mx-auto px-4 py-10">{children}</main>
      </body>
    </html>
  );
}
