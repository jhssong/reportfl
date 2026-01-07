{
  "filepath": "/tmp/Cli-1b/src/java/org/apache/commons/cli/GnuParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GnuParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Parser"
      ],
      "begin_line": 28,
      "end_line": 173,
      "comment": "\n * The class GnuParser provides an implementation of the \n * {@link Parser#flatten(Options,String[],boolean) flatten} method.\n *\n * @author John Keyes (john at integralsource.com)\n * @see Parser\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "tokens"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " holder for flattened tokens "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.GnuParser.init()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * \u003cp\u003eResets the members to their original state i.e. remove\n     * all of \u003ccode\u003etokens\u003c/code\u003e entries.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.GnuParser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 61,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eThis flatten method does so using the following rules:\n     * \u003col\u003e\n     *  \u003cli\u003eIf an {@link Option} exists for the first character of \n     *  the \u003ccode\u003earguments\u003c/code\u003e entry \u003cb\u003eAND\u003c/b\u003e an {@link Option} \n     *  does not exist for the whole \u003ccode\u003eargument\u003c/code\u003e then\n     *  add the first character as an option to the processed tokens\n     *  list e.g. \"-D\" and add the rest of the entry to the also.\u003c/li\u003e\n     *  \u003cli\u003eOtherwise just add the token to the processed tokens list.\n     *  \u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param options The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop \n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 15)",
        "(line 66,col 9)-(line 66,col 35)",
        "(line 67,col 9)-(line 67,col 36)",
        "(line 69,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 60)"
      ]
    }
  ]
}