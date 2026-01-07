{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/compressors/FileNameUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FileNameUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 196,
      "comment": "\n * File name mapping code for the compression formats.\n * @ThreadSafe\n * @since Apache Commons Compress 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "compressSuffix"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": "\n     * Map from common filename suffixes to the suffixes that identify compressed\n     * versions of those file types. For example: from \".tar\" to \".tgz\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressSuffix"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Map from common filename suffixes of compressed files to the\n     * corresponding suffixes of uncompressed files. For example: from\n     * \".tgz\" to \".tar\".\n     * \u003cp\u003e\n     * This map also contains format-specific suffixes like \".gz\" and \"-z\".\n     * These suffixes are mapped to the empty string, as they should simply\n     * be removed from the filename when the file is uncompressed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "longestCompressedSuffix"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Length of the longest compressed suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shortestCompressedSuffix"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Length of the shortest compressed suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "longestUncompressedSuffix"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Length of the longest uncompressed suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shortestUncompressedSuffix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Length of the shortest uncompressed suffix longer than the\n     * empty string.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultExtension"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * The format\u0027s default extension.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.FileNameUtil.FileNameUtil(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String)",
      "begin_line": 91,
      "end_line": 124,
      "comment": "\n     * sets up the utility with a map of known compressed to\n     * uncompressed suffix mappings and the default extension of the\n     * format.\n     *\n     * @param uncompressSuffix Map from common filename suffixes of\n     * compressed files to the corresponding suffixes of uncompressed\n     * files. For example: from \".tgz\" to \".tar\".  This map also\n     * contains format-specific suffixes like \".gz\" and \"-z\".  These\n     * suffixes are mapped to the empty string, as they should simply\n     * be removed from the filename when the file is uncompressed.\n     *\n     * @param defaultExtension the format\u0027s default extension like \".gz\"\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 78)",
        "(line 94,col 9)-(line 94,col 59)",
        "(line 95,col 9)-(line 95,col 59)",
        "(line 96,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 121,col 38)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.FileNameUtil.isCompressedFilename(java.lang.String)",
      "begin_line": 133,
      "end_line": 143,
      "comment": "\n     * Detects common format suffixes in the given filename.\n     *\n     * @param filename name of a file\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the filename has a common format suffix,\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 66)",
        "(line 135,col 9)-(line 135,col 37)",
        "(line 136,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.FileNameUtil.getUncompressedFilename(java.lang.String)",
      "begin_line": 158,
      "end_line": 169,
      "comment": "\n     * Maps the given name of a compressed file to the name that the\n     * file should have after uncompression. Commonly used file type specific\n     * suffixes like \".tgz\" or \".svgz\" are automatically detected and\n     * correctly mapped. For example the name \"package.tgz\" is mapped to\n     * \"package.tar\". And any filenames with the generic \".gz\" suffix\n     * (or any other generic gzip suffix) is mapped to a name without that\n     * suffix. If no format suffix is detected, then the filename is returned\n     * unmapped.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding uncompressed file\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 66)",
        "(line 160,col 9)-(line 160,col 37)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.FileNameUtil.getCompressedFilename(java.lang.String)",
      "begin_line": 182,
      "end_line": 194,
      "comment": "\n     * Maps the given filename to the name that the file should have after\n     * compressio. Common file types with custom suffixes for\n     * compressed versions are automatically detected and correctly mapped.\n     * For example the name \"package.tar\" is mapped to \"package.tgz\". If no\n     * custom mapping is applicable, then the default \".gz\" suffix is appended\n     * to the filename.\n     *\n     * @param filename name of a file\n     * @return name of the corresponding compressed file\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 66)",
        "(line 184,col 9)-(line 184,col 37)",
        "(line 185,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 43)"
      ]
    }
  ]
}