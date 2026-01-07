{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/brotli/BrotliUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrotliUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 89,
      "comment": "\n * Utility code for the Brotli compression format.\n * @ThreadSafe\n * @since 1.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "cachedBrotliAvailability"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.brotli.BrotliUtils.BrotliUtils()",
      "begin_line": 44,
      "end_line": 45,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.brotli.BrotliUtils.isBrotliCompressionAvailable()",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * Are the classes required to support Brotli compression available?\n     * @return true if the classes required to support Brotli compression are available\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 73)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.brotli.BrotliUtils.internalIsBrotliCompressionAvailable()",
      "begin_line": 60,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.brotli.BrotliUtils.setCacheBrotliAvailablity(boolean)",
      "begin_line": 75,
      "end_line": 83,
      "comment": "\n     * Whether to cache the result of the Brotli for Java check.\n     *\n     * \u003cp\u003eThis defaults to {@code false} in an OSGi environment and {@code true} otherwise.\u003c/p\u003e\n     * @param doCache whether to cache the result\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.brotli.BrotliUtils.getCachedBrotliAvailability()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " only exists to support unit tests",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)"
      ]
    }
  ]
}