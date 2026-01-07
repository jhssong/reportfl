{
  "filepath": "/tmp/Cli-38b/src/main/java/org/apache/commons/cli/CommandLineParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineParser",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 98,
      "comment": "\n * A class that implements the \u003ccode\u003eCommandLineParser\u003c/code\u003e interface\n * can parse a String array according to the {@link Options} specified\n * and return a {@link CommandLine}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Parse the arguments according to the specified options.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Parse the arguments according to the specified options.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    }
  ]
}