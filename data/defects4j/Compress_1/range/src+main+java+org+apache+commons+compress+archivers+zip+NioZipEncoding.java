{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/NioZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NioZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 40,
      "end_line": 122,
      "comment": "\n * A ZipEncoding, which uses a java.nio {@link\n * java.nio.charset.Charset Charset} to encode names.\n *\n * \u003cp\u003eThis implementation works for all cases under java-1.5 or\n * later. However, in java-1.4, some charsets don\u0027t have a java.nio\n * implementation, most notably the default ZIP encoding Cp437.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.NioZipEncoding(java.nio.charset.Charset)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Construct an NIO based zip encoding, which wraps the given\n     * charset.\n     * \n     * @param charset The NIO charset to wrap.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.canEncode(java.lang.String)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 55)",
        "(line 59,col 9)-(line 59,col 55)",
        "(line 60,col 9)-(line 60,col 60)",
        "(line 62,col 9)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.encode(java.lang.String)",
      "begin_line": 69,
      "end_line": 110,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 55)",
        "(line 72,col 9)-(line 72,col 55)",
        "(line 73,col 9)-(line 73,col 60)",
        "(line 75,col 9)-(line 75,col 46)",
        "(line 76,col 9)-(line 77,col 72)",
        "(line 79,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.decode(byte[])",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 120,col 54)"
      ]
    }
  ]
}