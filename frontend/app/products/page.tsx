// app/products/page.tsx

const products = [
  { id: 1, name: "Sample Product A", price: 1200 },
  { id: 2, name: "Sample Product B", price: 1800 },
  { id: 3, name: "Sample Product C", price: 2200 },
];

export default function ProductsPage() {
  return (
    <div>
      <h1 className="text-2xl font-bold mb-6">Products</h1>

      <div className="grid grid-cols-1 sm:grid-cols-2 gap-6">
        {products.map((product) => (
          <div
            key={product.id}
            className="border rounded-lg p-4 bg-white shadow-sm hover:shadow-md transition cursor-pointer"
          >
            <h2 className="text-lg font-semibold mb-2">{product.name}</h2>
            <p className="text-gray-700 mb-2">¥{product.price.toLocaleString()}</p>
            <button className="w-full bg-gray-900 text-white py-2 rounded-md text-sm hover:bg-gray-700 transition">
              Add to Cart
            </button>
          </div>
        ))}
      </div>
    </div>
  );
}
