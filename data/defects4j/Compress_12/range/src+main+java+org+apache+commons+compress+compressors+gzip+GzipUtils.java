{
  "filepath": "/tmp/Compress-12b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 100,
      "comment": "\n * Utility code for the gzip compression format.\n * @ThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "fileNameUtil"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.GzipUtils()",
      "begin_line": 54,
      "end_line": 55,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Detects common gzip suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the filename has a common gzip suffix,\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Maps the given name of a gzip-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".tgz\" or \".svgz\" are automatically detected and\n     * correctly mapped. For example the name \"package.tgz\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".gz\" suffix\n     * (or any other generic gzip suffix) is mapped to a name without that\n     * suffix. If no gzip suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipUtils.getCompressedFilename(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with gzip. Common file types with custom suffixes for\n     * compressed versions are automatically detected and correctly mapped.\n     * For example the name \"package.tar\" is mapped to \"package.tgz\". If no\n     * custom mapping is applicable, then the default \".gz\" suffix is appended\n     * to the filename.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 60)"
      ]
    }
  ]
}