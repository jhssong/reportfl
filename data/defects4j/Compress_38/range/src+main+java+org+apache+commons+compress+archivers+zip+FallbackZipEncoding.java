{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/archivers/zip/FallbackZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FallbackZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 43,
      "end_line": 96,
      "comment": "\n * A fallback ZipEncoding, which uses a java.io means to encode names.\n *\n * \u003cp\u003eThis implementation is not suitable for encodings other than\n * UTF-8, because java.io encodes unmappable character as question\n * marks leading to unreadable ZIP entries on some operating\n * systems.\u003c/p\u003e\n * \n * \u003cp\u003eFurthermore this implementation is unable to tell whether a\n * given name can be safely encoded or not.\u003c/p\u003e\n * \n * \u003cp\u003eThis implementation acts as a last resort implementation, when\n * neither {@link Simple8BitZipEnoding} nor {@link NioZipEncoding} is\n * available.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetName"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.FallbackZipEncoding()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Construct a fallback zip encoding, which uses the platform\u0027s\n     * default charset.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.FallbackZipEncoding(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Construct a fallback zip encoding, which uses the given charset.\n     * \n     * @param charsetName The name of the charset or {@code null} for\n     *                the platform\u0027s default character set.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.canEncode(java.lang.String)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.encode(java.lang.String)",
      "begin_line": 77,
      "end_line": 83,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.FallbackZipEncoding.decode(byte[])",
      "begin_line": 89,
      "end_line": 95,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 49)"
      ]
    }
  ]
}