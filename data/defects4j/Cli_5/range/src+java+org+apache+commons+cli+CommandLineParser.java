{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/CommandLineParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineParser",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 91,
      "comment": "\n * A class that implements the \u003ccode\u003eCommandLineParser\u003c/code\u003e interface \n * can parse a String array according to the {@link Options} specified\n * and return a {@link CommandLine}.\n *\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 40,
      "end_line": 41,
      "comment": "\n     * Parse the arguments according to the specified options.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Parse the arguments according to the specified options.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param stopAtNonOption specifies whether to continue parsing the\n     * arguments if a non option is encountered.\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLineParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption specifies whether to continue parsing the\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": []
    }
  ]
}