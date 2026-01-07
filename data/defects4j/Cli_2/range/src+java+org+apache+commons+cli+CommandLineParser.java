{
  "filepath": "/tmp/Cli-2b/src/java/org/apache/commons/cli/CommandLineParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineParser",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 90,
      "comment": "\n * A class that implements the \u003ccode\u003eCommandLineParser\u003c/code\u003e interface \n * can parse a String array according to the {@link Options} specified\n * and return a {@link CommandLine}.\n *\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * Parse the arguments according to the specified options.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Parse the arguments according to the specified options.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param stopAtNonOption specifies whether to continue parsing the\n     * arguments if a non option is encountered.\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption specifies whether to continue parsing the\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    }
  ]
}