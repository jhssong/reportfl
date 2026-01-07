{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/compare/ComparatorChain.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparatorChain",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 346,
      "comment": "\n * \u003cp\u003eA ComparatorChain is a Comparator that wraps one or\n * more Comparators in sequence.  The ComparatorChain\n * calls each Comparator in sequence until either 1)\n * any single Comparator returns a non-zero result\n * (and that result is then returned),\n * or 2) the ComparatorChain is exhausted (and zero is\n * returned).  This type of sorting is very similar\n * to multi-column sorting in SQL, and this class\n * allows Java classes to emulate that kind of behaviour\n * when sorting a List.\u003c/p\u003e\n *\n * \u003cp\u003eTo further facilitate SQL-like sorting, the order of\n * any single Comparator in the list can be reversed.\u003c/p\u003e\n *\n * \u003cp\u003eCalling a method that adds new Comparators or\n * changes the ascend/descend sort \u003ci\u003eafter compare(Object,\n * Object) has been called\u003c/i\u003e will result in an\n * UnsupportedOperationException.  However, \u003ci\u003etake care\u003c/i\u003e\n * to not alter the underlying List of Comparators\n * or the BitSet that defines the sort order.\u003c/p\u003e\n *\n * \u003cp\u003eInstances of ComparatorChain are not synchronized.\n * The class is not thread-safe at construction time, but\n * it \u003ci\u003eis\u003c/i\u003e thread-safe to perform multiple comparisons\n * after all the setup operations are complete.\u003c/p\u003e\n *\n * @since Commons Collections 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serialization version from Collections 2.0. "
    },
    {
      "type": "field",
      "varNames": [
        "comparatorChain"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The list of comparators in the chain. "
    },
    {
      "type": "field",
      "varNames": [
        "orderingBits"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Order - false (clear) \u003d ascend; true (set) \u003d descend. "
    },
    {
      "type": "field",
      "varNames": [
        "isLocked"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Whether the chain has been \"locked\". "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.ComparatorChain()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Construct a ComparatorChain with no Comparators.\n     * You must add at least one Comparator before calling\n     * the compare(Object,Object) method, or an\n     * UnsupportedOperationException is thrown\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.ComparatorChain(java.util.Comparator\u003cE\u003e)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Construct a ComparatorChain with a single Comparator,\n     * sorting in the forward order\n     *\n     * @param comparator First comparator in the Comparator chain\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.ComparatorChain(java.util.Comparator\u003cE\u003e, boolean)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Construct a Comparator chain with a single Comparator,\n     * sorting in the given order\n     *\n     * @param comparator First Comparator in the ComparatorChain\n     * @param reverse    false \u003d forward sort; true \u003d reverse sort\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 58)",
        "(line 98,col 9)-(line 98,col 40)",
        "(line 99,col 9)-(line 99,col 37)",
        "(line 100,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.ComparatorChain(java.util.List\u003cjava.util.Comparator\u003cE\u003e\u003e)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Construct a ComparatorChain from the Comparators in the\n     * List.  All Comparators will default to the forward\n     * sort order.\n     *\n     * @param list   List of Comparators\n     * @see #ComparatorChain(List,BitSet)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.ComparatorChain(java.util.List\u003cjava.util.Comparator\u003cE\u003e\u003e, java.util.BitSet)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Construct a ComparatorChain from the Comparators in the\n     * given List.  The sort order of each column will be\n     * drawn from the given BitSet.  When determining the sort\n     * order for Comparator at index \u003ci\u003ei\u003c/i\u003e in the List,\n     * the ComparatorChain will call BitSet.get(\u003ci\u003ei\u003c/i\u003e).\n     * If that method returns \u003ci\u003efalse\u003c/i\u003e, the forward\n     * sort order is used; a return value of \u003ci\u003etrue\u003c/i\u003e\n     * indicates reverse sort order.\n     *\n     * @param list   List of Comparators.  NOTE: This constructor does not perform a\n     *               defensive copy of the list\n     * @param bits   Sort order for each Comparator.  Extra bits are ignored,\n     *               unless extra Comparators are added by another method.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 31)",
        "(line 134,col 9)-(line 134,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.addComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Add a Comparator to the end of the chain using the\n     * forward sort order\n     *\n     * @param comparator Comparator with the forward sort order\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.addComparator(java.util.Comparator\u003cE\u003e, boolean)",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * Add a Comparator to the end of the chain using the\n     * given sort order\n     *\n     * @param comparator Comparator to add to the end of the chain\n     * @param reverse    false \u003d forward sort order; true \u003d reverse sort order\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 22)",
        "(line 158,col 9)-(line 158,col 40)",
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.setComparator(int, java.util.Comparator\u003cE\u003e)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Replace the Comparator at the given index, maintaining\n     * the existing sort order.\n     *\n     * @param index      index of the Comparator to replace\n     * @param comparator Comparator to place at the given index\n     * @exception IndexOutOfBoundsException\n     *                   if index \u0026lt; 0 or index \u0026gt;\u003d size()\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.setComparator(int, java.util.Comparator\u003cE\u003e, boolean)",
      "begin_line": 185,
      "end_line": 194,
      "comment": "\n     * Replace the Comparator at the given index in the\n     * ComparatorChain, using the given sort order\n     *\n     * @param index      index of the Comparator to replace\n     * @param comparator Comparator to set\n     * @param reverse    false \u003d forward sort order; true \u003d reverse sort order\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 22)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.setForwardSort(int)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Change the sort order at the given index in the\n     * ComparatorChain to a forward sort.\n     *\n     * @param index  Index of the ComparatorChain\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 22)",
        "(line 204,col 9)-(line 204,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.setReverseSort(int)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * Change the sort order at the given index in the\n     * ComparatorChain to a reverse sort.\n     *\n     * @param index  Index of the ComparatorChain\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 22)",
        "(line 215,col 9)-(line 215,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.size()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Number of Comparators in the current ComparatorChain.\n     *\n     * @return Comparator count\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.isLocked()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Determine if modifications can still be made to the\n     * ComparatorChain.  ComparatorChains cannot be modified\n     * once they have performed a comparison.\n     *\n     * @return true \u003d ComparatorChain cannot be modified; false \u003d\n     *         ComparatorChain can still be modified.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.checkLocked()",
      "begin_line": 240,
      "end_line": 244,
      "comment": " throw an exception if the ComparatorChain is locked",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.checkChainIntegrity()",
      "begin_line": 246,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.compare(E, E)",
      "begin_line": 264,
      "end_line": 291,
      "comment": "\n     * Perform comparisons on the Objects as per\n     * Comparator.compare(o1,o2).\n     *\n     * @param o1  the first object to compare\n     * @param o2  the second object to compare\n     * @return -1, 0, or 1\n     * @exception UnsupportedOperationException\n     *                   if the ComparatorChain does not contain at least one\n     *                   Comparator\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 287,col 9)",
        "(line 290,col 9)-(line 290,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.hashCode()",
      "begin_line": 301,
      "end_line": 311,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a suitable hash code\n     * @since Commons Collections 3.0\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 21)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorChain.equals(java.lang.Object)",
      "begin_line": 329,
      "end_line": 344,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is\n     * is a {@link Comparator} whose ordering is known to be\n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e\n     * equals \u003ccode\u003ethis.getClass()\u003c/code\u003e, and the underlying\n     * comparators and order bits are equal.\n     * Subclasses may want to override this behavior to remain consistent\n     * with the {@link Comparator#equals(Object)} contract.\n     *\n     * @param object  the object to compare with\n     * @return true if equal\n     * @since Commons Collections 3.0\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 21)"
      ]
    }
  ]
}