{
  "filepath": "/tmp/Compress-11b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2Utils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2Utils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 93,
      "comment": "\n * Utility code for the BZip2 compression format.\n * @ThreadSafe\n * @since Commons Compress 1.1\n "
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
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.BZip2Utils()",
      "begin_line": 48,
      "end_line": 49,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.isCompressedFilename(java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Detects common bzip2 suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the filename has a common bzip2 suffix,\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.getUncompressedFilename(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Maps the given name of a bzip2-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".tbz\" or \".tbz2\" are automatically detected and\n     * correctly mapped. For example the name \"package.tbz2\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".bz2\" suffix\n     * (or any other generic bzip2 suffix) is mapped to a name without that\n     * suffix. If no bzip2 suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.getCompressedFilename(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with bzip2. Currently this method simply appends the suffix\n     * \".bz2\" to the filename based on the standard behaviour of the \"bzip2\"\n     * program, but a future version may implement a more complex mapping if\n     * a new widely used naming pattern emerges.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 60)"
      ]
    }
  ]
}