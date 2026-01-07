{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ArgumentOutsideDomainException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArgumentOutsideDomainException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FunctionEvaluationException"
      ],
      "begin_line": 26,
      "end_line": 44,
      "comment": "\n * Error thrown when a method is called with an out of bounds argument.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ArgumentOutsideDomainException.ArgumentOutsideDomainException(double, double, double)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param lower lower bound of the domain\n     * @param upper upper bound of the domain\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 41,col 103)"
      ]
    }
  ]
}