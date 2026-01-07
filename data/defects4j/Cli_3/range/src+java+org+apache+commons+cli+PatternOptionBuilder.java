{
  "filepath": "/tmp/Cli-3b/src/java/org/apache/commons/cli/PatternOptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PatternOptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 212,
      "comment": " \n * \u003cp\u003e\n * Allows Options to be created from a single String.\n * The pattern contains various single character flags and via\n * an optional punctuation character, their expected type.\n * \u003c/p\u003e\n *\n * \u003ctable border\u003d\"1\"\u003e\n * \u003ctr\u003e\u003ctd\u003ea\u003c/td\u003e\u003ctd\u003e-a flag\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eb@\u003c/td\u003e\u003ctd\u003e-b [classname]\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ec\u0026gt;\u003c/td\u003e\u003ctd\u003e-c [filename]\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ed+\u003c/td\u003e\u003ctd\u003e-d [classname] (creates object via empty contructor)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ee%\u003c/td\u003e\u003ctd\u003e-e [number] (creates Double/Long instance depeding on existing of a \u0027.\u0027)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ef/\u003c/td\u003e\u003ctd\u003e-f [url]\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eg:\u003c/td\u003e\u003ctd\u003e-g [string]\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * \u003cp\u003e\n * For example, the following allows command line flags of \u0027-v -p string-value -f /dir/file\u0027.\n * \u003c/p\u003e\n * \u003ccode\u003eOptions options \u003d PatternOptionBuilder.parsePattern(\"vp:f/\");\u003c/code\u003e\n *\n * \u003cp\u003e\n * TODO These need to break out to OptionType and also \n * to be pluggable.\n * \u003c/p\u003e\n *\n * @author Henri Yandell (bayard @ generationjava.com)\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STRING_VALUE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " String class "
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_VALUE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Object class "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_VALUE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number class "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_VALUE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Date class "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_VALUE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Class class "
    },
    {
      "type": "field",
      "varNames": [
        "EXISTING_FILE_VALUE"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " FileInputStream class "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_VALUE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " File class "
    },
    {
      "type": "field",
      "varNames": [
        "FILES_VALUE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " File array class "
    },
    {
      "type": "field",
      "varNames": [
        "URL_VALUE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " URL class "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.getValueClass(char)",
      "begin_line": 88,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eRetrieve the class that \u003ccode\u003ech\u003c/code\u003e represents.\u003c/p\u003e\n     *\n     * @param ch the specified character\n     * @return The class that \u003ccode\u003ech\u003c/code\u003e represents\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.isValueCode(char)",
      "begin_line": 137,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eReturns whether \u003ccode\u003ech\u003c/code\u003e is a value code, i.e.\n     * whether it represents a class in a pattern.\u003c/p\u003e\n     * \n     * @param ch the specified character\n     * @return true if \u003ccode\u003ech\u003c/code\u003e is a value code, otherwise false.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.parsePattern(java.lang.String)",
      "begin_line": 156,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003eReturns the {@link Options} instance represented by \n     * \u003ccode\u003epattern\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param pattern the pattern string\n     * @return The {@link Options} instance\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 34)",
        "(line 160,col 9)-(line 160,col 23)",
        "(line 161,col 9)-(line 161,col 22)",
        "(line 162,col 9)-(line 162,col 33)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 165,col 9)-(line 165,col 40)",
        "(line 167,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 23)"
      ]
    }
  ]
}