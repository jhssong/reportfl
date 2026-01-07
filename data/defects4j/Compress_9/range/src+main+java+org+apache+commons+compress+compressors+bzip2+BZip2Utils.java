{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2Utils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2Utils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 114,
      "comment": "\n * Utility code for the BZip2 compression format.\n * @ThreadSafe\n * @since Commons Compress 1.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressSuffix"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": "\n     * Map from common filename suffixes of bzip2ed files to the corresponding\n     * suffixes of uncompressed files. For example: from \".tbz2\" to \".tar\".\n     * \u003cp\u003e\n     * This map also contains bzip2-specific suffixes like \".bz2\". These\n     * suffixes are mapped to the empty string, as they should simply be\n     * removed from the filename when the file is uncompressed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.BZip2Utils()",
      "begin_line": 52,
      "end_line": 53,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.isCompressedFilename(java.lang.String)",
      "begin_line": 62,
      "end_line": 72,
      "comment": "\n     * Detects common bzip2 suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the filename has a common bzip2 suffix,\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 60)",
        "(line 64,col 9)-(line 64,col 31)",
        "(line 66,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.getUncompressedFilename(java.lang.String)",
      "begin_line": 87,
      "end_line": 98,
      "comment": "\n     * Maps the given name of a bzip2-compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".tbz\" or \".tbz2\" are automatically detected and\n     * correctly mapped. For example the name \"package.tbz2\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".bz2\" suffix\n     * (or any other generic bzip2 suffix) is mapped to a name without that\n     * suffix. If no bzip2 suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 60)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 91,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2Utils.getCompressedFilename(java.lang.String)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compression with bzip2. Currently this method simply appends the suffix\n     * \".bz2\" to the filename based on the standard behaviour of the \"bzip2\"\n     * program, but a future version may implement a more complex mapping if\n     * a new widely used naming pattern emerges.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 33)"
      ]
    }
  ]
}