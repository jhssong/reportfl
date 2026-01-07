{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/FilterListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FilterListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 283,
      "comment": "\n * Decorates another {@link ListIterator} using a predicate to filter elements.\n * \u003cp\u003e\n * This iterator decorates the underlying iterator, only allowing through\n * those elements that match the specified {@link Predicate Predicate}.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The iterator being used "
    },
    {
      "type": "field",
      "varNames": [
        "predicate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The predicate being used "
    },
    {
      "type": "field",
      "varNames": [
        "nextObject"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The value of the next (matching) object, when\n     * {@link #nextObjectSet} is true.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextObjectSet"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Whether or not the {@link #nextObject} has been set\n     * (possibly to \u003ccode\u003enull\u003c/code\u003e).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previousObject"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The value of the previous (matching) object, when\n     * {@link #previousObjectSet} is true.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previousObjectSet"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Whether or not the {@link #previousObject} has been set\n     * (possibly to \u003ccode\u003enull\u003c/code\u003e).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * The index of the element that would be returned by {@link #next}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.FilterListIterator()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterListIterator\u003c/code\u003e that will not function\n     * until {@link #setListIterator(ListIterator) setListIterator}\n     * and {@link #setPredicate(Predicate) setPredicate} are invoked.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.FilterListIterator(java.util.ListIterator\u003c? extends E\u003e)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterListIterator\u003c/code\u003e that will not\n     * function until {@link #setPredicate(Predicate) setPredicate} is invoked.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 16)",
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.FilterListIterator(java.util.ListIterator\u003c? extends E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterListIterator\u003c/code\u003e.\n     *\n     * @param iterator  the iterator to use\n     * @param predicate  the predicate to use\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 16)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.FilterListIterator(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterListIterator\u003c/code\u003e that will not function\n     * until {@link #setListIterator(ListIterator) setListIterator} is invoked.\n     *\n     * @param predicate  the predicate to use.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 111,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.add(E)",
      "begin_line": 116,
      "end_line": 119,
      "comment": " Not supported. ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.hasNext()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.hasPrevious()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.next()",
      "begin_line": 131,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 20)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 26)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.nextIndex()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.previous()",
      "begin_line": 149,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 158,col 30)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.previousIndex()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.remove()",
      "begin_line": 168,
      "end_line": 171,
      "comment": " Not supported. ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.set(E)",
      "begin_line": 174,
      "end_line": 177,
      "comment": " Not supported. ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.getListIterator()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Gets the iterator this iterator is using.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setListIterator(java.util.ListIterator\u003c? extends E\u003e)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Sets the iterator for this iterator to use.\n     * If iteration has started, this effectively resets the iterator.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.getPredicate()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Gets the predicate this iterator is using.\n     *\n     * @return the predicate.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setPredicate(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Sets the predicate this the iterator to use.\n     *\n     * @param predicate  the transformer to use\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.clearNextObject()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 26)",
        "(line 221,col 9)-(line 221,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setNextObject()",
      "begin_line": 224,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.clearPreviousObject()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 30)",
        "(line 253,col 9)-(line 253,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setPreviousObject()",
      "begin_line": 256,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 21)"
      ]
    }
  ]
}