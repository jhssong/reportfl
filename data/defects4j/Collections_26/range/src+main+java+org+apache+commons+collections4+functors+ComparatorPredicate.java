{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/ComparatorPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparatorPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 79,
      "end_line": 191,
      "comment": "\n * Predicate that compares the input object with the one stored in the predicate using a comparator.\n * In addition, the comparator result can be evaluated in accordance to a supplied criterion value.\n *\n * In order to demonstrate the use of the predicate, the following variables are declared:\n *\n * \u003cpre\u003e\n * Integer ONE \u003d Integer.valueOf(1);\n * Integer TWO \u003d Integer.valueOf(2);\n *\n * Comparator comparator \u003d new Comparator() {\n *\n *     public int compare(Object first, Object second) {\n *         return ((Integer) second) - ((Integer) first);\n *     }\n *\n * };\n * \u003c/pre\u003e\n *\n * Using the declared variables, the \u003ccode\u003eComparatorPredicate\u003c/code\u003e can be used used in the\n * following way:\n *\n * \u003cpre\u003e\n * ComparatorPredicate.comparatorPredicate(ONE, comparator).evaluate(TWO);\n * \u003c/pre\u003e\n *\n * The input variable \u003ccode\u003eTWO\u003c/code\u003e in compared to the stored variable \u003ccode\u003eONE\u003c/code\u003e using\n * the supplied \u003ccode\u003ecomparator\u003c/code\u003e. This is the default usage of the predicate and will return\n * \u003ccode\u003etrue\u003c/code\u003e if the underlying comparator returns \u003ccode\u003e0\u003c/code\u003e. In addition to the default\n * usage of the predicate, it is possible to evaluate the comparator\u0027s result in several ways. The\n * following {@link Criterion} enumeration values are provided by the predicate:\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n *     \u003cli\u003eEQUAL\u003c/li\u003e\n *     \u003cli\u003eGREATER\u003c/li\u003e\n *     \u003cli\u003eGREATER_OR_EQUAL\u003c/li\u003e\n *     \u003cli\u003eLESS\u003c/li\u003e\n *     \u003cli\u003eLESS_OR_EQUAL\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * The following examples demonstrates how these constants can be used in order to manipulate the\n * evaluation of a comparator result.\n *\n * \u003cpre\u003e\n * ComparatorPredicate.comparatorPredicate(ONE, comparator,\u003cb\u003eComparatorPredicate.Criterion.GREATER\u003c/b\u003e).evaluate(TWO);\n * \u003c/pre\u003e\n *\n * The input variable TWO is compared to the stored variable ONE using the supplied \u003ccode\u003ecomparator\u003c/code\u003e\n * using the \u003ccode\u003eGREATER\u003c/code\u003e evaluation criterion constant. This instructs the predicate to\n * return \u003ccode\u003etrue\u003c/code\u003e if the comparator returns a value greater than \u003ccode\u003e0\u003c/code\u003e.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The internal object to compare with "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The comparator to use for comparison "
    },
    {
      "type": "field",
      "varNames": [
        "criterion"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The comparison evaluation criterion to use "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Factory to create the comparator predicate\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param object  the object to compare to\n     * @param comparator  the comparator to use for comparison\n     * @return the predicate\n     * @throws NullPointerException if comparator is null\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T, java.util.Comparator\u003cT\u003e, org.apache.commons.collections4.functors.ComparatorPredicate.Criterion)",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * Factory to create the comparator predicate\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param object  the object to compare to\n     * @param comparator  the comparator to use for comparison\n     * @param criterion  the criterion to use to evaluate comparison\n     * @return the predicate\n     * @throws NullPointerException if comparator or criterion is null\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ComparatorPredicate.ComparatorPredicate(T, java.util.Comparator\u003cT\u003e, org.apache.commons.collections4.functors.ComparatorPredicate.Criterion)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003ecomparatorPredicate\u003c/code\u003e if you want that.\n     *\n     * @param object  the object to compare to\n     * @param comparator  the comparator to use for comparison\n     * @param criterion  the criterion to use to evaluate comparison\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 16)",
        "(line 142,col 9)-(line 142,col 29)",
        "(line 143,col 9)-(line 143,col 37)",
        "(line 144,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ComparatorPredicate.evaluate(T)",
      "begin_line": 165,
      "end_line": 190,
      "comment": "\n     * Evaluates the predicate. The predicate evaluates to \u003ccode\u003etrue\u003c/code\u003e in the following cases:\n     *\n     * \u003cul\u003e\n     *     \u003cli\u003e\u003ccode\u003ecomparator.compare(object, input) \u003d\u003d 0 \u0026\u0026 criterion \u003d\u003d EQUAL\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e\u003ccode\u003ecomparator.compare(object, input) \u003c 0 \u0026\u0026 criterion \u003d\u003d LESS\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e\u003ccode\u003ecomparator.compare(object, input) \u003e 0 \u0026\u0026 criterion \u003d\u003d GREATER\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e\u003ccode\u003ecomparator.compare(object, input) \u003e\u003d 0 \u0026\u0026 criterion \u003d\u003d GREATER_OR_EQUAL\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e\u003ccode\u003ecomparator.compare(object, input) \u003c\u003d 0 \u0026\u0026 criterion \u003d\u003d LESS_OR_EQUAL\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see org.apache.commons.collections4.Predicate#evaluate(java.lang.Object)\n     * @see java.util.Comparator#compare(java.lang.Object first, java.lang.Object second)\n     *\n     * @param target  the target object to compare to\n     * @return {@code true} if the comparison succeeds according to the selected criterion\n     * @throws IllegalStateException if the criterion is invalid (really not possible)\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 31)",
        "(line 168,col 9)-(line 168,col 66)",
        "(line 169,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 22)"
      ]
    }
  ]
}