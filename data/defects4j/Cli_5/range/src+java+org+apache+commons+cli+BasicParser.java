{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/BasicParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Parser"
      ],
      "begin_line": 26,
      "end_line": 47,
      "comment": "\n * The class BasicParser provides a very simple implementation of\n * the {@link Parser#flatten(Options,String[],boolean) flatten} method.\n *\n * @author John Keyes (john at integralsource.com)\n * @see Parser\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.BasicParser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 41,
      "end_line": 46,
      "comment": "\n     * \u003cp\u003eA simple implementation of {@link Parser}\u0027s abstract\n     * {@link Parser#flatten(Options,String[],boolean) flatten} method.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e \u003ccode\u003eoptions\u003c/code\u003e and \u003ccode\u003estopAtNonOption\u003c/code\u003e\n     * are not used in this \u003ccode\u003eflatten\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param options The command line {@link Options}\n     * @param arguments The command line arguments to be parsed\n     * @param stopAtNonOption Specifies whether to stop flattening\n     * when an non option is found.\n     * @return The \u003ccode\u003earguments\u003c/code\u003e String array.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 25)"
      ]
    }
  ]
}