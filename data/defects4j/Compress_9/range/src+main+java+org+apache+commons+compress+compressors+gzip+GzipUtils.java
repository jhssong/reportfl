{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 144,
      "comment": "\n * Utility code for the gzip compression format.\n * @ThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "compressSuffix"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": "\n     * Map from common filename suffixes to the suffixes that identify gzipped\n     * versions of those file types. For example: from \".tar\" to \".tgz\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressSuffix"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Map from common filename suffixes of gzipped files to the corresponding\n     * suffixes of uncompressed files. For example: from \".tgz\" to \".tar\".\n     * \u003cp\u003e\n     * This map also contains gzip-specific suffixes like \".gz\" and \"-z\".\n     * These suffixes are mapped to the empty string, as they should simply\n     * be removed from the filename when the file is uncompressed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.GzipUtils()",
      "begin_line": 71,
      "end_line": 72,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename(java.lang.String)",
      "begin_line": 81,
      "end_line": 91,
      "comment": "\n     * Detects common gzip suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the filename has a common gzip suffix,\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 31)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename(java.lang.String)",
      "begin_line": 106,
      "end_line": 117,
      "comment": "\n     * Maps the given name of a gzip-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".tgz\" or \".svgz\" are automatically detected and\n     * correctly mapped. For example the name \"package.tgz\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".gz\" suffix\n     * (or any other generic gzip suffix) is mapped to a name without that\n     * suffix. If no gzip suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 60)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 110,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.getCompressedFilename(java.lang.String)",
      "begin_line": 130,
      "end_line": 142,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with gzip. Common file types with custom suffixes for\n     * compressed versions are automatically detected and correctly mapped.\n     * For example the name \"package.tar\" is mapped to \"package.tgz\". If no\n     * custom mapping is applicable, then the default \".gz\" suffix is appended\n     * to the filename.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 60)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 134,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 32)"
      ]
    }
  ]
}