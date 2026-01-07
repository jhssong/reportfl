{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/compressors/lzma/LZMAUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZMAUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 161,
      "comment": "\n * Utility code for the lzma compression format.\n * @ThreadSafe\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "fileNameUtil"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_MAGIC"
      ],
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * LZMA Header Magic Bytes begin a LZMA file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cachedLZMAAvailability"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.LZMAUtils()",
      "begin_line": 61,
      "end_line": 62,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byte[], int)",
      "begin_line": 71,
      "end_line": 83,
      "comment": "\n     * Checks if the signature matches what is expected for a .lzma file.\n     *\n     * @param   signature     the bytes to check\n     * @param   length        the number of bytes to check\n     * @return  true if signature matches the .lzma magic bytes, false otherwise\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.isLZMACompressionAvailable()",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Are the classes required to support LZMA compression available?\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 71)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.internalIsLZMACompressionAvailable()",
      "begin_line": 96,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.isCompressedFilename(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Detects common lzma suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return {@code true} if the filename has a common lzma suffix,\n     *         {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.getUncompressedFilename(java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Maps the given name of a lzma-compressed file to the name that\n     * the file should have after uncompression.  Any filenames with\n     * the generic \".lzma\" suffix (or any other generic lzma suffix)\n     * is mapped to a name without that suffix. If no lzma suffix is\n     * detected, then the filename is returned unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.getCompressedFilename(java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with lzma.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.setCacheLZMAAvailablity(boolean)",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n     * Whether to cache the result of the LZMA check.\n     *\n     * \u003cp\u003eThis defaults to {@code false} in an OSGi environment and {@code true} otherwise.\u003c/p\u003e\n     * @param doCache whether to cache the result\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMAUtils.getCachedLZMAAvailability()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " only exists to support unit tests",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 38)"
      ]
    }
  ]
}