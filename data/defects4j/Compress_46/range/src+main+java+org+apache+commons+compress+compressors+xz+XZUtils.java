{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/compressors/xz/XZUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 180,
      "comment": "\n * Utility code for the xz compression format.\n * @ThreadSafe\n * @since 1.4\n "
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
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * XZ Header Magic Bytes begin a XZ file.\n     *\n     * \u003cp\u003eThis is a copy of {@code org.tukaani.xz.XZ.HEADER_MAGIC} in\n     * XZ for Java version 1.5.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cachedXZAvailability"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.XZUtils()",
      "begin_line": 65,
      "end_line": 66,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.matches(byte[], int)",
      "begin_line": 80,
      "end_line": 92,
      "comment": "\n     * Checks if the signature matches what is expected for a .xz file.\n     *\n     * \u003cp\u003eThis is more or less a copy of the version found in {@link\n     * XZCompressorInputStream} but doesn\u0027t depend on the presence of\n     * XZ for Java.\u003c/p\u003e\n     *\n     * @param   signature     the bytes to check\n     * @param   length        the number of bytes to check\n     * @return  true if signature matches the .xz magic bytes, false otherwise\n     * @since 1.9\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.isXZCompressionAvailable()",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * Are the classes required to support XZ compression available?\n     * @since 1.5\n     * @return true if the classes required to support XZ compression are available\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 69)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.internalIsXZCompressionAvailable()",
      "begin_line": 107,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename(java.lang.String)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Detects common xz suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return {@code true} if the filename has a common xz suffix,\n     *         {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.getUncompressedFilename(java.lang.String)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Maps the given name of a xz-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".txz\" are automatically detected and\n     * correctly mapped. For example the name \"package.txz\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".xz\" suffix\n     * (or any other generic xz suffix) is mapped to a name without that\n     * suffix. If no xz suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename(java.lang.String)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with xz. Common file types with custom suffixes for\n     * compressed versions are automatically detected and correctly mapped.\n     * For example the name \"package.tar\" is mapped to \"package.txz\". If no\n     * custom mapping is applicable, then the default \".xz\" suffix is appended\n     * to the filename.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.setCacheXZAvailablity(boolean)",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n     * Whether to cache the result of the XZ for Java check.\n     *\n     * \u003cp\u003eThis defaults to {@code false} in an OSGi environment and {@code true} otherwise.\u003c/p\u003e\n     * @param doCache whether to cache the result\n     * @since 1.9\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.getCachedXZAvailability()",
      "begin_line": 177,
      "end_line": 179,
      "comment": " only exists to support unit tests",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 36)"
      ]
    }
  ]
}