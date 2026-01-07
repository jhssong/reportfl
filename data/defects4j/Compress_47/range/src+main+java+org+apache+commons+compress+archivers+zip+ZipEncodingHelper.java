{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/ZipEncodingHelper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipEncodingHelper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 96,
      "comment": "\n * Static helper functions for robustly encoding filenames in zip files.\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTF8"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * name of the encoding UTF-8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF8_ZIP_ENCODING"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * the encoding UTF-8\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(java.lang.String)",
      "begin_line": 54,
      "end_line": 64,
      "comment": "\n     * Instantiates a zip encoding. An NIO based character set encoder/decoder will be returned.\n     * As a special case, if the character set is UTF-8, the nio encoder will be configured  replace malformed and\n     * unmappable characters with \u0027?\u0027. This matches existing behavior from the older fallback encoder.\n     * \u003cp\u003e\n     *     If the requested characer set cannot be found, the platform default will\n     *     be used instead.\n     * \u003c/p\u003e\n     * @param name The name of the zip encoding. Specify {@code null} for\n     *             the platform\u0027s default encoding.\n     * @return A zip encoding for the given encoding name.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 46)",
        "(line 56,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 51)",
        "(line 63,col 9)-(line 63,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(java.lang.String)",
      "begin_line": 71,
      "end_line": 85,
      "comment": "\n     * Returns whether a given encoding is UTF-8. If the given name is null, then check the platform\u0027s default encoding.\n     *\n     * @param charsetName If the given name is null, then check the platform\u0027s default encoding.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.growBufferBy(java.nio.ByteBuffer, int)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 40)",
        "(line 89,col 9)-(line 89,col 24)",
        "(line 91,col 9)-(line 91,col 81)",
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 94,col 18)"
      ]
    }
  ]
}