{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 142,
      "comment": "\n * Utility code for the gzip compression format.\n * @ThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "compressSuffix"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Map from common filename suffixes to the suffixes that identify gzipped\n     * versions of those file types. For example: from \".tar\" to \".tgz\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressSuffix"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Map from common filename suffixes of gzipped files to the corresponding\n     * suffixes of uncompressed files. For example: from \".tgz\" to \".tar\".\n     * \u003cp\u003e\n     * This map also contains gzip-specific suffixes like \".gz\" and \"-z\".\n     * These suffixes are mapped to the empty string, as they should simply\n     * be removed from the filename when the file is uncompressed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.GzipUtils()",
      "begin_line": 69,
      "end_line": 70,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename(java.lang.String)",
      "begin_line": 79,
      "end_line": 89,
      "comment": "\n     * Detects common gzip suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the filename has a common gzip suffix,\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 60)",
        "(line 81,col 9)-(line 81,col 31)",
        "(line 83,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename(java.lang.String)",
      "begin_line": 104,
      "end_line": 115,
      "comment": "\n     * Maps the given name of a gzip-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".tgz\" or \".svgz\" are automatically detected and\n     * correctly mapped. For example the name \"package.tgz\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".gz\" suffix\n     * (or any other generic gzip suffix) is mapped to a name without that\n     * suffix. If no gzip suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 60)",
        "(line 106,col 9)-(line 106,col 31)",
        "(line 108,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.getCompressedFilename(java.lang.String)",
      "begin_line": 128,
      "end_line": 140,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with gzip. Common file types with custom suffixes for\n     * compressed versions are automatically detected and correctly mapped.\n     * For example the name \"package.tar\" is mapped to \"package.tgz\". If no\n     * custom mapping is applicable, then the default \".gz\" suffix is appended\n     * to the filename.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 60)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 32)"
      ]
    }
  ]
}