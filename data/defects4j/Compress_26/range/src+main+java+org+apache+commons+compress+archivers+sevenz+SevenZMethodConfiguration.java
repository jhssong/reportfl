{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZMethodConfiguration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZMethodConfiguration",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 79,
      "comment": "\n * Combines a SevenZMethod with configuration options for the method.\n *\n * \u003cp\u003eThe exact type and interpretation of options depends on the\n * method being configured.  Currently supported are:\u003c/p\u003e\n *\n * \u003ctable\u003e\n * \u003ctr\u003e\u003cth\u003eMethod\u003c/th\u003e\u003cth\u003eOption Type\u003c/th\u003e\u003cth\u003eDescription\u003c/th\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eBZIP2\u003c/td\u003e\u003ctd\u003eNumber\u003c/td\u003e\u003ctd\u003eBlock Size - an number between 1 and 9\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eDEFLATE\u003c/td\u003e\u003ctd\u003eNumber\u003c/td\u003e\u003ctd\u003eCompression Level - an number between 1 and 9\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eLZMA2\u003c/td\u003e\u003ctd\u003eNumber\u003c/td\u003e\u003ctd\u003eDictionary Size - a number between 4096 and 768 MiB (768 \u0026lt;\u0026lt; 20)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eLZMA2\u003c/td\u003e\u003ctd\u003eorg.tukaani.xz.LZMA2Options\u003c/td\u003e\u003ctd\u003eWhole set of LZMA2 options.\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eDELTA_FILTER\u003c/td\u003e\u003ctd\u003eNumber\u003c/td\u003e\u003ctd\u003eDelta Distance - a number between 1 and 256\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @Immutable\n * @since 1.8\n "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration.SevenZMethodConfiguration(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Doesn\u0027t configure any additional options.\n     * @param method the method to use\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration.SevenZMethodConfiguration(org.apache.commons.compress.archivers.sevenz.SevenZMethod, java.lang.Object)",
      "begin_line": 56,
      "end_line": 63,
      "comment": "\n     * Specifies and method plus configuration options.\n     * @param method the method to use\n     * @param options the options to use\n     * @throws IllegalArgumentException if the method doesn\u0027t understand the options specified.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)",
        "(line 58,col 9)-(line 58,col 31)",
        "(line 59,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration.getMethod()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * The specified method.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration.getOptions()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * The specified options.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 23)"
      ]
    }
  ]
}