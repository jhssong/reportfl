{
  "filepath": "/tmp/Cli-15b/src/java/org/apache/commons/cli2/validation/Validator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 43,
      "comment": "\n * The validation interface for validating argument values(s).\n *\n * A validator can replace the argument string value with a\n * specific class instance e.g. the {@link UrlValidator} replaces\n * the string value with a {@link java.net.URL} instance.\n *\n * @author Rob Oxspring\n * @author John Keyes\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.Validator.validate(java.util.List)",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Validate the specified values (List of Strings).\n     *\n     * @param values The values to validate.\n     *\n     * @throws InvalidArgumentException If any of the\n     * specified values are not valid.\n     ",
      "child_ranges": []
    }
  ]
}