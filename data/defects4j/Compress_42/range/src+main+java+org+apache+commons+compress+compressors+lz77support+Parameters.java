{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/lz77support/Parameters.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parameters",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 125,
      "comment": "\n * Parameters of the {@link LZ77Compressor compressor}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TRUE_MIN_MATCH_LENGTH"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "windowSize",
        "minMatchLength",
        "maxMatchLength",
        "maxOffset",
        "maxLiteralLength"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Parameters(int)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Initializes the compressor\u0027s parameters with a\n     * \u003ccode\u003eminMatchLength\u003c/code\u003e of 3 and \u003ccode\u003emax*Length\u003c/code\u003e\n     * equal to \u003ccode\u003ewindowSize - 1\u003c/code\u003e.\n     *\n     * @param windowSize the size of the sliding window - this\n     * determines the maximum offset a back-reference can take.\n     * @throws IllegalArgumentException if \u003ccode\u003ewindowSize\u003c/code\u003e\n     * is smaller than \u003ccode\u003eminMatchLength\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Parameters(int, int, int, int, int)",
      "begin_line": 66,
      "end_line": 82,
      "comment": "\n     * Initializes the compressor\u0027s parameters.\n     *\n     * @param windowSize the size of the sliding window, must be a\n     * power of two - this determines the maximum offset a\n     * back-reference can take.\n     * @param minMatchLength the minimal length of a match found. A\n     * true minimum of 3 is hard-coded inside of this implemention\n     * but bigger lengths can be configured.\n     * @param maxMatchLength maximal length of a match found. A value\n     * smaller than \u003ccode\u003eminMatchLength\u003c/code\u003e as well as values\n     * bigger than \u003ccode\u003ewindowSize - 1\u003c/code\u003e are interpreted as\n     * \u003ccode\u003ewindowSize - 1\u003c/code\u003e.\n     * @param maxOffset maximal offset of a back-reference. A\n     * non-positive value as well as values bigger than\n     * \u003ccode\u003ewindowSize - 1\u003c/code\u003e are interpreted as \u003ccode\u003ewindowSize\n     * - 1\u003c/code\u003e.\n     * @param maxLiteralLength maximal length of a literal\n     * block. Negative numbers and 0 as well as values bigger than\n     * \u003ccode\u003ewindowSize\u003c/code\u003e are interpreted as\n     * \u003ccode\u003ewindowSize\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003ewindowSize\u003c/code\u003e is\n     * smaller than \u003ccode\u003eminMatchLength\u003c/code\u003e or not a power of two.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 78)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 37)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 76)",
        "(line 78,col 9)-(line 79,col 46)",
        "(line 80,col 9)-(line 81,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getWindowSize()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Gets the size of the sliding window - this determines the\n     * maximum offset a back-reference can take.\n     * @return the size of the sliding window\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMinMatchLength()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Gets the minimal length of a match found.\n     * @return the minimal length of a match found\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxMatchLength()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Gets the maximal length of a match found.\n     * @return the maximal length of a match found\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxOffset()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Gets the maximal offset of a match found.\n     * @return the maximal offset of a match found\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxLiteralLength()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Gets the maximal length of a literal block.\n     * @return the maximal length of a literal block\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.isPowerOfTwo(int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 34)"
      ]
    }
  ]
}