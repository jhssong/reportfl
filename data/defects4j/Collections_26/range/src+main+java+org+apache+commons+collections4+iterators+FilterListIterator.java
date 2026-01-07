{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/FilterListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FilterListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 274,
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
      "end_line": 118,
      "comment": " Not supported. ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.hasNext()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.hasPrevious()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.next()",
      "begin_line": 128,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)",
        "(line 135,col 9)-(line 135,col 34)",
        "(line 136,col 9)-(line 136,col 26)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.nextIndex()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.previous()",
      "begin_line": 144,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 20)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 152,col 30)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.previousIndex()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.remove()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " Not supported. ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.set(E)",
      "begin_line": 166,
      "end_line": 168,
      "comment": " Not supported. ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.getListIterator()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Gets the iterator this iterator is using.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setListIterator(java.util.ListIterator\u003c? extends E\u003e)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Sets the iterator for this iterator to use.\n     * If iteration has started, this effectively resets the iterator.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.getPredicate()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Gets the predicate this iterator is using.\n     *\n     * @return the predicate.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setPredicate(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Sets the predicate this the iterator to use.\n     *\n     * @param predicate  the transformer to use\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.clearNextObject()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 26)",
        "(line 212,col 9)-(line 212,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setNextObject()",
      "begin_line": 215,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.clearPreviousObject()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 30)",
        "(line 244,col 9)-(line 244,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterListIterator.setPreviousObject()",
      "begin_line": 247,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 21)"
      ]
    }
  ]
}