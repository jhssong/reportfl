{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/DefaultEquator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultEquator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Equator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 85,
      "comment": "\n * Default {@link Equator} implementation.\n *\n * @param \u003cT\u003e  the types of object this {@link Equator} can evaluate.\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Static instance "
    },
    {
      "type": "field",
      "varNames": [
        "HASHCODE_NULL"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Hashcode used for \u003ccode\u003enull\u003c/code\u003e objects.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.DefaultEquator.defaultEquator()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Factory returning the typed singleton instance.\n     *\n     * @param \u003cT\u003e  the object type\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.DefaultEquator.DefaultEquator()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.DefaultEquator.equate(T, T)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * {@inheritDoc} Delegates to {@link Object#equals(Object)}.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.DefaultEquator.hash(T)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return \u003ccode\u003eo.hashCode()\u003c/code\u003e if \u003ccode\u003eo\u003c/code\u003e is non-\n     *         \u003ccode\u003enull\u003c/code\u003e, else {@link #HASHCODE_NULL}.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.DefaultEquator.readResolve()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)"
      ]
    }
  ]
}