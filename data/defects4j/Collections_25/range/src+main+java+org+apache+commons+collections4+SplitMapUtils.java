{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/SplitMapUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplitMapUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 244,
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
      "end_line": 125,
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
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.containsKey(java.lang.Object)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.containsValue(java.lang.Object)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.entrySet()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.equals(java.lang.Object)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 75,col 13)",
        "(line 76,col 13)-(line 76,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.get(java.lang.Object)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.hashCode()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.isEmpty()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.keySet()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.put(K, V)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.remove(java.lang.Object)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.size()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.values()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedGet.mapIterator()",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 33)",
        "(line 118,col 13)-(line 122,col 13)",
        "(line 123,col 13)-(line 123,col 71)"
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
      "begin_line": 127,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "put"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.WrappedPut(org.apache.commons.collections4.Put\u003cK, V\u003e)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.clear()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.containsKey(java.lang.Object)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.containsValue(java.lang.Object)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.entrySet()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.equals(java.lang.Object)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 154,col 13)",
        "(line 155,col 13)-(line 155,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.get(java.lang.Object)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.hashCode()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.isEmpty()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.keySet()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.put(K, V)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.remove(java.lang.Object)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.size()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.WrappedPut.values()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.readableMap(org.apache.commons.collections4.Get\u003cK, V\u003e)",
      "begin_line": 209,
      "end_line": 219,
      "comment": "\n     * Get the specified {@link Get} as an instance of {@link IterableMap}.\n     * If \u003ccode\u003eget\u003c/code\u003e implements {@link IterableMap} directly, no conversion will take place.\n     * If \u003ccode\u003eget\u003c/code\u003e implements {@link Map} but not {@link IterableMap} it will be decorated.\n     * Otherwise an {@link Unmodifiable} {@link IterableMap} will be returned.\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param get to wrap, must not be null\n     * @return {@link IterableMap}\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SplitMapUtils.writableMap(org.apache.commons.collections4.Put\u003cK, V\u003e)",
      "begin_line": 233,
      "end_line": 242,
      "comment": "\n     * Get the specified {@link Put} as an instanceof {@link Map}.\n     * If \u003ccode\u003eput\u003c/code\u003e implements {@link Map} directly, no conversion will take place.\n     * Otherwise a \u003cem\u003ewrite-only\u003c/em\u003e {@link Map} will be returned.  On such a {@link Map}\n     * it is recommended that the result of #put(K, V) be discarded as it likely will not\n     * match \u003ccode\u003eV\u003c/code\u003e at runtime.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the element type\n     * @param put to wrap, must not be null\n     * @return {@link Map}\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 41)"
      ]
    }
  ]
}