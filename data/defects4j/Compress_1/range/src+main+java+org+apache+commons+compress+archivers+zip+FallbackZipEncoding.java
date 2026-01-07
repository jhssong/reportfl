{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/FallbackZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FallbackZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 42,
      "end_line": 94,
      "comment": "\n * A fallback ZipEncoding, which uses a java.io means to encode names.\n *\n * \u003cp\u003eThis implementation is not favorable for encodings other than\n * utf-8, because java.io encodes unmappable character as question\n * marks leading to unreadable ZIP entries on some operating\n * systems.\u003c/p\u003e\n * \n * \u003cp\u003eFurthermore this implementation is unable to tell, whether a\n * given name can be safely encoded or not.\u003c/p\u003e\n * \n * \u003cp\u003eThis implementation acts as a last resort implementation, when\n * neither {@link Simple8BitZipEnoding} nor {@link NioZipEncoding} is\n * available.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.FallbackZipEncoding()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Construct a fallback zip encoding, which uses the platform\u0027s\n     * default charset.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.FallbackZipEncoding(java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Construct a fallback zip encoding, which uses the given charset.\n     * \n     * @param charset The name of the charset or \u003ccode\u003enull\u003c/code\u003e for\n     *                the platform\u0027s default character set.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.canEncode(java.lang.String)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.encode(java.lang.String)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.decode(byte[])",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 92,col 9)"
      ]
    }
  ]
}