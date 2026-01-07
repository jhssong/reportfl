{
  "filepath": "/tmp/Cli-36b/src/main/java/org/apache/commons/cli/GnuParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GnuParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Parser"
      ],
      "begin_line": 30,
      "end_line": 115,
      "comment": "\n * The class GnuParser provides an implementation of the\n * {@link Parser#flatten(Options, String[], boolean) flatten} method.\n *\n * @version $Id$\n * @deprecated since 1.3, use the {@link DefaultParser} instead\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.GnuParser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 50,
      "end_line": 114,
      "comment": "\n     * This flatten method does so using the following rules:\n     * \u003col\u003e\n     *   \u003cli\u003eIf an {@link Option} exists for the first character of\n     *   the \u003ccode\u003earguments\u003c/code\u003e entry \u003cb\u003eAND\u003c/b\u003e an {@link Option}\n     *   does not exist for the whole \u003ccode\u003eargument\u003c/code\u003e then\n     *   add the first character as an option to the processed tokens\n     *   list e.g. \"-D\" and add the rest of the entry to the also.\u003c/li\u003e\n     *   \u003cli\u003eOtherwise just add the token to the processed tokens list.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param options         The Options to parse the arguments by.\n     * @param arguments       The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop flattening when\n     *                        a non option has been encountered\n     * @return a String array of the flattened arguments\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 54)",
        "(line 55,col 9)-(line 55,col 35)",
        "(line 57,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 57)"
      ]
    }
  ]
}