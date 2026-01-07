{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/compressors/xz/XZUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 102,
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
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.XZUtils()",
      "begin_line": 43,
      "end_line": 44,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.isXZCompressionAvailable()",
      "begin_line": 50,
      "end_line": 57,
      "comment": "\n     * Are the classes required to support XZ compression available?\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Detects common xz suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return {@code true} if the filename has a common xz suffix,\n     *         {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.getUncompressedFilename(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Maps the given name of a xz-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".txz\" are automatically detected and\n     * correctly mapped. For example the name \"package.txz\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".xz\" suffix\n     * (or any other generic xz suffix) is mapped to a name without that\n     * suffix. If no xz suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename(java.lang.String)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with xz. Common file types with custom suffixes for\n     * compressed versions are automatically detected and correctly mapped.\n     * For example the name \"package.tar\" is mapped to \"package.txz\". If no\n     * custom mapping is applicable, then the default \".xz\" suffix is appended\n     * to the filename.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 60)"
      ]
    }
  ]
}