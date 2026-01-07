{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/CharsetAccessor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharsetAccessor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 44,
      "comment": "\n * An interface added to allow access to the character set associated with an {@link NioZipEncoding},\n * without requiring a new method to be added to {@link ZipEncoding}.\n * \u003cp\u003e\n * This avoids introducing a\n * potentially breaking change, or making {@link NioZipEncoding} a public class.\n * \u003c/p\u003e\n * @since 1.15\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.CharsetAccessor.getCharset()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Provides access to the character set associated with an object.\n     * \u003cp\u003e\n     *     This allows nio oriented code to use more natural character encoding/decoding methods,\n     *     whilst allowing existing code to continue to rely on special-case error handling for UTF-8.\n     * \u003c/p\u003e\n     * @return the character set associated with this object\n     ",
      "child_ranges": []
    }
  ]
}