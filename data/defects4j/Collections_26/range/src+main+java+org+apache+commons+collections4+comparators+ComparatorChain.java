{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/comparators/ComparatorChain.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparatorChain",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 349,
      "comment": "\n * A ComparatorChain is a Comparator that wraps one or more Comparators in\n * sequence. The ComparatorChain calls each Comparator in sequence until either\n * 1) any single Comparator returns a non-zero result (and that result is then\n * returned), or 2) the ComparatorChain is exhausted (and zero is returned).\n * This type of sorting is very similar to multi-column sorting in SQL, and this\n * class allows Java classes to emulate that kind of behaviour when sorting a\n * List.\n * \u003cp\u003e\n * To further facilitate SQL-like sorting, the order of any single Comparator in\n * the list can be reversed.\n * \u003cp\u003e\n * Calling a method that adds new Comparators or changes the ascend/descend sort\n * \u003ci\u003eafter compare(Object, Object) has been called\u003c/i\u003e will result in an\n * UnsupportedOperationException. However, \u003ci\u003etake care\u003c/i\u003e to not alter the\n * underlying List of Comparators or the BitSet that defines the sort order.\n * \u003cp\u003e\n * Instances of ComparatorChain are not synchronized. The class is not\n * thread-safe at construction time, but it \u003ci\u003eis\u003c/i\u003e thread-safe to perform\n * multiple comparisons after all the setup operations are complete.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serialization version from Collections 2.0. "
    },
    {
      "type": "field",
      "varNames": [
        "comparatorChain"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The list of comparators in the chain. "
    },
    {
      "type": "field",
      "varNames": [
        "orderingBits"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Order - false (clear) \u003d ascend; true (set) \u003d descend. "
    },
    {
      "type": "field",
      "varNames": [
        "isLocked"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Whether the chain has been \"locked\". "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.ComparatorChain()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Construct a ComparatorChain with no Comparators.\n     * You must add at least one Comparator before calling\n     * the compare(Object,Object) method, or an\n     * UnsupportedOperationException is thrown\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.ComparatorChain(java.util.Comparator\u003cE\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Construct a ComparatorChain with a single Comparator,\n     * sorting in the forward order\n     *\n     * @param comparator First comparator in the Comparator chain\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.ComparatorChain(java.util.Comparator\u003cE\u003e, boolean)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * Construct a Comparator chain with a single Comparator,\n     * sorting in the given order\n     *\n     * @param comparator First Comparator in the ComparatorChain\n     * @param reverse    false \u003d forward sort; true \u003d reverse sort\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 58)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 93,col 9)-(line 93,col 37)",
        "(line 94,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.ComparatorChain(java.util.List\u003cjava.util.Comparator\u003cE\u003e\u003e)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Construct a ComparatorChain from the Comparators in the\n     * List.  All Comparators will default to the forward\n     * sort order.\n     *\n     * @param list   List of Comparators\n     * @see #ComparatorChain(List,BitSet)\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.ComparatorChain(java.util.List\u003cjava.util.Comparator\u003cE\u003e\u003e, java.util.BitSet)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Construct a ComparatorChain from the Comparators in the\n     * given List.  The sort order of each column will be\n     * drawn from the given BitSet.  When determining the sort\n     * order for Comparator at index \u003ci\u003ei\u003c/i\u003e in the List,\n     * the ComparatorChain will call BitSet.get(\u003ci\u003ei\u003c/i\u003e).\n     * If that method returns \u003ci\u003efalse\u003c/i\u003e, the forward\n     * sort order is used; a return value of \u003ci\u003etrue\u003c/i\u003e\n     * indicates reverse sort order.\n     *\n     * @param list   List of Comparators.  NOTE: This constructor does not perform a\n     *               defensive copy of the list\n     * @param bits   Sort order for each Comparator.  Extra bits are ignored,\n     *               unless extra Comparators are added by another method.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 31)",
        "(line 128,col 9)-(line 128,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.addComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Add a Comparator to the end of the chain using the\n     * forward sort order\n     *\n     * @param comparator Comparator with the forward sort order\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.addComparator(java.util.Comparator\u003cE\u003e, boolean)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "\n     * Add a Comparator to the end of the chain using the\n     * given sort order\n     *\n     * @param comparator Comparator to add to the end of the chain\n     * @param reverse    false \u003d forward sort order; true \u003d reverse sort order\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 22)",
        "(line 152,col 9)-(line 152,col 40)",
        "(line 153,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.setComparator(int, java.util.Comparator\u003cE\u003e)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Replace the Comparator at the given index, maintaining\n     * the existing sort order.\n     *\n     * @param index      index of the Comparator to replace\n     * @param comparator Comparator to place at the given index\n     * @exception IndexOutOfBoundsException\n     *                   if index \u0026lt; 0 or index \u0026gt;\u003d size()\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.setComparator(int, java.util.Comparator\u003cE\u003e, boolean)",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * Replace the Comparator at the given index in the\n     * ComparatorChain, using the given sort order\n     *\n     * @param index      index of the Comparator to replace\n     * @param comparator Comparator to set\n     * @param reverse    false \u003d forward sort order; true \u003d reverse sort order\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 22)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.setForwardSort(int)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Change the sort order at the given index in the\n     * ComparatorChain to a forward sort.\n     *\n     * @param index  Index of the ComparatorChain\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 22)",
        "(line 198,col 9)-(line 198,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.setReverseSort(int)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Change the sort order at the given index in the\n     * ComparatorChain to a reverse sort.\n     *\n     * @param index  Index of the ComparatorChain\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 22)",
        "(line 209,col 9)-(line 209,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.size()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Number of Comparators in the current ComparatorChain.\n     *\n     * @return Comparator count\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.isLocked()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Determine if modifications can still be made to the\n     * ComparatorChain.  ComparatorChains cannot be modified\n     * once they have performed a comparison.\n     *\n     * @return true \u003d ComparatorChain cannot be modified; false \u003d\n     *         ComparatorChain can still be modified.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.checkLocked()",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\n     * Throws an exception if the {@link ComparatorChain} is locked.\n     *\n     * @throws UnsupportedOperationException if the {@link ComparatorChain} is locked\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.checkChainIntegrity()",
      "begin_line": 250,
      "end_line": 254,
      "comment": "\n     * Throws an exception if the {@link ComparatorChain} is empty.\n     *\n     * @throws UnsupportedOperationException if the {@link ComparatorChain} is empty\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.compare(E, E)",
      "begin_line": 266,
      "end_line": 294,
      "comment": "\n     * Perform comparisons on the Objects as per\n     * Comparator.compare(o1,o2).\n     *\n     * @param o1  the first object to compare\n     * @param o2  the second object to compare\n     * @return -1, 0, or 1\n     * @throws UnsupportedOperationException if the ComparatorChain does not contain at least one Comparator\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 271,col 9)",
        "(line 274,col 9)-(line 274,col 79)",
        "(line 275,col 9)-(line 290,col 9)",
        "(line 293,col 9)-(line 293,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.hashCode()",
      "begin_line": 304,
      "end_line": 314,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a suitable hash code\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 21)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparatorChain.equals(java.lang.Object)",
      "begin_line": 332,
      "end_line": 347,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is\n     * is a {@link Comparator} whose ordering is known to be\n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e\n     * equals \u003ccode\u003ethis.getClass()\u003c/code\u003e, and the underlying\n     * comparators and order bits are equal.\n     * Subclasses may want to override this behavior to remain consistent\n     * with the {@link Comparator#equals(Object)} contract.\n     *\n     * @param object  the object to compare with\n     * @return true if equal\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 21)"
      ]
    }
  ]
}