{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/AbstractInputCheckedMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractInputCheckedMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e"
      ],
      "begin_line": 45,
      "end_line": 206,
      "comment": "\n * An abstract base class that simplifies the task of creating map decorators.\n * \u003cp\u003e\n * The Map API is very difficult to decorate correctly, and involves implementing\n * lots of different classes. This class exists to provide a simpler API.\n * \u003cp\u003e\n * Special hook methods are provided that are called when objects are added to\n * the map. By overriding these methods, the input can be validated or manipulated.\n * In addition to the main map methods, the entrySet is also affected, which is\n * the hardest part of writing map implementations.\n * \u003cp\u003e\n * This class is package-scoped, and may be withdrawn or replaced in future\n * versions of Commons Collections.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.AbstractInputCheckedMapDecorator()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.AbstractInputCheckedMapDecorator(java.util.Map\u003cK, V\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.checkSetValue(V)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Hook method called when a value is being set using \u003ccode\u003esetValue\u003c/code\u003e.\n     * \u003cp\u003e\n     * An implementation may validate the value and throw an exception\n     * or it may transform the value into another object.\n     * \u003cp\u003e\n     * This implementation returns the input value.\n     *\n     * @param value  the value to check\n     * @throws UnsupportedOperationException if the map may not be changed by setValue\n     * @throws IllegalArgumentException if the specified value is invalid\n     * @throws ClassCastException if the class of the specified value is invalid\n     * @throws NullPointerException if the specified value is null and nulls are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.isSetValueChecking()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Hook method called to determine if \u003ccode\u003echeckSetValue\u003c/code\u003e has any effect.\n     * \u003cp\u003e\n     * An implementation should return false if the \u003ccode\u003echeckSetValue\u003c/code\u003e method\n     * has no effect as this optimises the implementation.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @return true always\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.entrySet()",
      "begin_line": 97,
      "end_line": 103,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSetDecorator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 109,
      "end_line": 163,
      "comment": "\n     * Implementation of an entry set that checks additions via setValue.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Generated serial version ID. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.EntrySet.EntrySet(java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e, org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator\u003cK, V\u003e)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 23)",
        "(line 119,col 13)-(line 119,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.EntrySet.iterator()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.EntrySet.toArray()",
      "begin_line": 127,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 62)",
        "(line 131,col 13)-(line 133,col 13)",
        "(line 134,col 13)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.EntrySet.toArray(T[])",
      "begin_line": 137,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 36)",
        "(line 141,col 13)-(line 145,col 13)",
        "(line 146,col 13)-(line 146,col 54)",
        "(line 147,col 13)-(line 149,col 13)",
        "(line 152,col 13)-(line 154,col 13)",
        "(line 157,col 13)-(line 157,col 65)",
        "(line 158,col 13)-(line 160,col 13)",
        "(line 161,col 13)-(line 161,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 168,
      "end_line": 184,
      "comment": "\n     * Implementation of an entry set iterator that checks additions via setValue.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.EntrySetIterator.EntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e, org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator\u003cK, V\u003e)",
      "begin_line": 173,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 28)",
        "(line 176,col 13)-(line 176,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.EntrySetIterator.next()",
      "begin_line": 179,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 63)",
        "(line 182,col 13)-(line 182,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator\u003cK, V\u003e"
      ],
      "begin_line": 189,
      "end_line": 204,
      "comment": "\n     * Implementation of a map entry that checks additions via setValue.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.MapEntry.MapEntry(java.util.Map.Entry\u003cK, V\u003e, org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator\u003cK, V\u003e)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 25)",
        "(line 196,col 13)-(line 196,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator.MapEntry.setValue(V)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 48)",
        "(line 202,col 13)-(line 202,col 49)"
      ]
    }
  ]
}