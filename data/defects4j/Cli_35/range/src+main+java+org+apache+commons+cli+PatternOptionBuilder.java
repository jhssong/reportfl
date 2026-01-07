{
  "filepath": "/tmp/Cli-35b/src/main/java/org/apache/commons/cli/PatternOptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PatternOptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 207,
      "comment": "\n * \u003cp\u003eAllows Options to be created from a single String.\n * The pattern contains various single character flags and via\n * an optional punctuation character, their expected type.\n * \u003c/p\u003e\n * \n * \u003ctable border\u003d\"1\"\u003e\n *   \u003ccaption\u003eOverview of PatternOptionBuilder patterns\u003c/caption\u003e\n *   \u003ctr\u003e\u003ctd\u003ea\u003c/td\u003e\u003ctd\u003e-a flag\u003c/td\u003e\u003c/tr\u003e\n *   \u003ctr\u003e\u003ctd\u003eb@\u003c/td\u003e\u003ctd\u003e-b [classname]\u003c/td\u003e\u003c/tr\u003e\n *   \u003ctr\u003e\u003ctd\u003ec\u0026gt;\u003c/td\u003e\u003ctd\u003e-c [filename]\u003c/td\u003e\u003c/tr\u003e\n *   \u003ctr\u003e\u003ctd\u003ed+\u003c/td\u003e\u003ctd\u003e-d [classname] (creates object via empty constructor)\u003c/td\u003e\u003c/tr\u003e\n *   \u003ctr\u003e\u003ctd\u003ee%\u003c/td\u003e\u003ctd\u003e-e [number] (creates Double/Long instance depending on existing of a \u0027.\u0027)\u003c/td\u003e\u003c/tr\u003e\n *   \u003ctr\u003e\u003ctd\u003ef/\u003c/td\u003e\u003ctd\u003e-f [url]\u003c/td\u003e\u003c/tr\u003e\n *   \u003ctr\u003e\u003ctd\u003eg:\u003c/td\u003e\u003ctd\u003e-g [string]\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n * \n * \u003cp\u003e\n * For example, the following allows command line flags of \u0027-v -p string-value -f /dir/file\u0027.\n * The exclamation mark precede a mandatory option.\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n *     Options options \u003d PatternOptionBuilder.parsePattern(\"vp:!f/\");\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * TODO: These need to break out to OptionType and also to be pluggable.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STRING_VALUE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " String class "
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_VALUE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Object class "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_VALUE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Number class "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_VALUE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Date class "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_VALUE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Class class "
    },
    {
      "type": "field",
      "varNames": [
        "EXISTING_FILE_VALUE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " FileInputStream class "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_VALUE"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " File class "
    },
    {
      "type": "field",
      "varNames": [
        "FILES_VALUE"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " File array class "
    },
    {
      "type": "field",
      "varNames": [
        "URL_VALUE"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " URL class "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.getValueClass(char)",
      "begin_line": 96,
      "end_line": 121,
      "comment": "\n     * Retrieve the class that \u003ccode\u003ech\u003c/code\u003e represents.\n     *\n     * @param ch the specified character\n     * @return The class that \u003ccode\u003ech\u003c/code\u003e represents\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.isValueCode(char)",
      "begin_line": 130,
      "end_line": 142,
      "comment": "\n     * Returns whether \u003ccode\u003ech\u003c/code\u003e is a value code, i.e.\n     * whether it represents a class in a pattern.\n     *\n     * @param ch the specified character\n     * @return true if \u003ccode\u003ech\u003c/code\u003e is a value code, otherwise false.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PatternOptionBuilder.parsePattern(java.lang.String)",
      "begin_line": 150,
      "end_line": 206,
      "comment": "\n     * Returns the {@link Options} instance represented by \u003ccode\u003epattern\u003c/code\u003e.\n     *\n     * @param pattern the pattern string\n     * @return The {@link Options} instance\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 23)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 154,col 9)-(line 154,col 29)",
        "(line 156,col 9)-(line 156,col 40)",
        "(line 158,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 23)"
      ]
    }
  ]
}