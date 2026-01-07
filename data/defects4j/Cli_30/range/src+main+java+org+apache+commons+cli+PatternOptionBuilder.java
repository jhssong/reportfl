{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/PatternOptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PatternOptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 201,
      "comment": "\n * \u003cp\u003e\n * Allows Options to be created from a single String.\n * The pattern contains various single character flags and via\n * an optional punctuation character, their expected type.\n * \u003c/p\u003e\n *\n * \u003ctable border\u003d\"1\"\u003e\n * \u003ctr\u003e\u003ctd\u003ea\u003c/td\u003e\u003ctd\u003e-a flag\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eb@\u003c/td\u003e\u003ctd\u003e-b [classname]\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ec\u0026gt;\u003c/td\u003e\u003ctd\u003e-c [filename]\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ed+\u003c/td\u003e\u003ctd\u003e-d [classname] (creates object via empty contructor)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ee%\u003c/td\u003e\u003ctd\u003e-e [number] (creates Double/Long instance depeding on existing of a \u0027.\u0027)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003ef/\u003c/td\u003e\u003ctd\u003e-f [url]\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003eg:\u003c/td\u003e\u003ctd\u003e-g [string]\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * \u003cp\u003e\n * For example, the following allows command line flags of \u0027-v -p string-value -f /dir/file\u0027.\n * The exclamation mark precede a mandatory option.\n * \u003c/p\u003e\n * \u003ccode\u003eOptions options \u003d PatternOptionBuilder.parsePattern(\"vp:!f/\");\u003c/code\u003e\n *\n * \u003cp\u003e\n * TODO These need to break out to OptionType and also\n * to be pluggable.\n * \u003c/p\u003e\n *\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STRING_VALUE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " String class "
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_VALUE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Object class "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_VALUE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Number class "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_VALUE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Date class "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_VALUE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Class class "
    },
    {
      "type": "field",
      "varNames": [
        "EXISTING_FILE_VALUE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " FileInputStream class "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_VALUE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " File class "
    },
    {
      "type": "field",
      "varNames": [
        "FILES_VALUE"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " File array class "
    },
    {
      "type": "field",
      "varNames": [
        "URL_VALUE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " URL class "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.getValueClass(char)",
      "begin_line": 94,
      "end_line": 119,
      "comment": "\n     * Retrieve the class that \u003ccode\u003ech\u003c/code\u003e represents.\n     *\n     * @param ch the specified character\n     * @return The class that \u003ccode\u003ech\u003c/code\u003e represents\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.isValueCode(char)",
      "begin_line": 128,
      "end_line": 140,
      "comment": "\n     * Returns whether \u003ccode\u003ech\u003c/code\u003e is a value code, i.e.\n     * whether it represents a class in a pattern.\n     *\n     * @param ch the specified character\n     * @return true if \u003ccode\u003ech\u003c/code\u003e is a value code, otherwise false.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 139,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.parsePattern(java.lang.String)",
      "begin_line": 148,
      "end_line": 200,
      "comment": "\n     * Returns the {@link Options} instance represented by \u003ccode\u003epattern\u003c/code\u003e.\n     *\n     * @param pattern the pattern string\n     * @return The {@link Options} instance\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 23)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 27)",
        "(line 154,col 9)-(line 154,col 40)",
        "(line 156,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 23)"
      ]
    }
  ]
}