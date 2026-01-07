{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/SplitMapUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplitMapUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 272,
      "comment": "\n * Utilities for working with \"split maps:\" objects that implement {@link Put}\n * and/or {@link Get} but not {@link Map}.\n *\n * @since 4.0\n * @version $Id$\n *\n * @see Get\n * @see Put\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.SplitMapUtils.SplitMapUtils()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * \u003ccode\u003eSplitMapUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "WrappedGet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.IterableMap\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 48,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "get"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.WrappedGet(org.apache.commons.collections4.Get\u003cK, V\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.clear()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.containsKey(java.lang.Object)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.containsValue(java.lang.Object)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.entrySet()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.equals(java.lang.Object)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 79,col 13)",
        "(line 80,col 13)-(line 80,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.get(java.lang.Object)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.hashCode()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.isEmpty()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.keySet()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.put(K, V)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.remove(java.lang.Object)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.size()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.values()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.mapIterator()",
      "begin_line": 128,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 33)",
        "(line 131,col 13)-(line 135,col 13)",
        "(line 136,col 13)-(line 136,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrappedPut",
      "is_interface": false,
      "parent_types": [
        "java.util.Map\u003cK, V\u003e",
        "org.apache.commons.collections4.Put\u003cK, V\u003e"
      ],
      "begin_line": 140,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "put"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.WrappedPut(org.apache.commons.collections4.Put\u003cK, V\u003e)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.clear()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.containsKey(java.lang.Object)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.containsValue(java.lang.Object)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.entrySet()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.equals(java.lang.Object)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 171,col 13)",
        "(line 172,col 13)-(line 172,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.get(java.lang.Object)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.hashCode()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 182,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.isEmpty()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.keySet()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.put(K, V)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.remove(java.lang.Object)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.size()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.values()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.readableMap(org.apache.commons.collections4.Get\u003cK, V\u003e)",
      "begin_line": 235,
      "end_line": 246,
      "comment": "\n     * Get the specified {@link Get} as an instance of {@link IterableMap}.\n     * If \u003ccode\u003eget\u003c/code\u003e implements {@link IterableMap} directly, no conversion will take place.\n     * If \u003ccode\u003eget\u003c/code\u003e implements {@link Map} but not {@link IterableMap} it will be decorated.\n     * Otherwise an {@link Unmodifiable} {@link IterableMap} will be returned.\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param get to wrap, must not be null\n     * @return {@link IterableMap}\n     * @throws NullPointerException if the argument is null\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.writableMap(org.apache.commons.collections4.Put\u003cK, V\u003e)",
      "begin_line": 261,
      "end_line": 270,
      "comment": "\n     * Get the specified {@link Put} as an instanceof {@link Map}.\n     * If \u003ccode\u003eput\u003c/code\u003e implements {@link Map} directly, no conversion will take place.\n     * Otherwise a \u003cem\u003ewrite-only\u003c/em\u003e {@link Map} will be returned.  On such a {@link Map}\n     * it is recommended that the result of #put(K, V) be discarded as it likely will not\n     * match \u003ccode\u003eV\u003c/code\u003e at runtime.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the element type\n     * @param put to wrap, must not be null\n     * @return {@link Map}\n     * @throws NullPointerException if the argument is null\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 41)"
      ]
    }
  ]
}