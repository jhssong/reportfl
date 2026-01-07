{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/Group.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Group",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.cli2.Option"
      ],
      "begin_line": 25,
      "end_line": 65,
      "comment": "\n * An Option representing a choice or group of Options in the form \"-a|-b|-c\".\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Group.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator, java.lang.String)",
      "begin_line": 35,
      "end_line": 39,
      "comment": "\n     * Appends usage information to the specified StringBuffer\n     * \n     * @param buffer the buffer to append to\n     * @param helpSettings a set of display settings @see DisplaySetting\n     * @param comp a comparator used to sort the Options\n     * @param separator the String used to separate member Options \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Group.isRequired()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Indicates whether group members must be present for the CommandLine to be\n     * valid.\n     *\n     * @see #getMinimum()\n     * @see #getMaximum()\n     * @return true iff the CommandLine will be invalid without at least one \n     *         member option\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Group.getMinimum()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Retrieves the minimum number of members required for a valid Group\n     *\n     * @return the minimum number of members\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.Group.getMaximum()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Retrieves the maximum number of members acceptable for a valid Group\n     *\n     * @return the maximum number of members\n     ",
      "child_ranges": []
    }
  ]
}