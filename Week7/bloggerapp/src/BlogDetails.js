// src/BlogDetails.js
import React from 'react';

const BlogDetails = () => {
  const blogs = [
    { id: 1, title: "React Basics", author: "Sreeja" },
    { id: 2, title: "Understanding JSX", author: "Akhil" },
    { id: 3, title: "React Hooks", author: "Deepa" },
  ];

  return (
    <div>
      <h2>📝 Blog Posts</h2>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>
            {blog.title} — <i>{blog.author}</i>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
