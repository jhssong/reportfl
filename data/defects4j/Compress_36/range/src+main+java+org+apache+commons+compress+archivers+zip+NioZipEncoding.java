{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/zip/NioZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NioZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 41,
      "end_line": 126,
      "comment": "\n * A ZipEncoding, which uses a java.nio {@link\n * java.nio.charset.Charset Charset} to encode names.\n *\n * \u003cp\u003eThis implementation works for all cases under java-1.5 or\n * later. However, in java-1.4, some charsets don\u0027t have a java.nio\n * implementation, most notably the default ZIP encoding Cp437.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.NioZipEncoding(java.nio.charset.Charset)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Construct an NIO based zip encoding, which wraps the given\n     * charset.\n     * \n     * @param charset The NIO charset to wrap.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.canEncode(java.lang.String)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 61)",
        "(line 61,col 9)-(line 61,col 55)",
        "(line 62,col 9)-(line 62,col 60)",
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.encode(java.lang.String)",
      "begin_line": 71,
      "end_line": 113,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)",
        "(line 75,col 9)-(line 75,col 55)",
        "(line 76,col 9)-(line 76,col 60)",
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 80,col 72)",
        "(line 82,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 34)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.decode(byte[])",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 124,col 54)"
      ]
    }
  ]
}