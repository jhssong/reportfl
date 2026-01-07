{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/Parent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parent",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.cli2.Option"
      ],
      "begin_line": 25,
      "end_line": 41,
      "comment": "\n * An Option that can have an argument and/or group of child Options in the form\n * \"-f \u0026lt;arg\u0026gt; [-a|-b|-c]\".\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Parent.processParent(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Processes the parent part of the Option.  The combination of parent,\n     * argument and children is handled by the process method.\n     * @see Option#process(WriteableCommandLine, ListIterator)\n     *\n     * @param commandLine the CommandLine to write results to\n     * @param args a ListIterator over argument strings positioned at the next\n     *             argument to process\n     * @throws OptionException if an error occurs while processing\n     ",
      "child_ranges": []
    }
  ]
}