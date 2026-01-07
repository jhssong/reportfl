{
  "filepath": "/tmp/Lang-14b/src/test/java/org/apache/commons/lang3/builder/ToStringStyleConcurrencyTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringStyleConcurrencyTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 109,
      "comment": "\r\n * Tests concurrent access for the default {@link ToStringStyle}.\r\n * \u003cp\u003e\r\n * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We\r\n * want to make sure that we do not get concurrency exceptions accessing this registry.\r\n * \u003c/p\u003e\r\n * \u003cp\u003e\r\n * This test passes but only tests one aspect of the issue.\r\n * \u003c/p\u003e\r\n * \r\n * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/LANG-762\"\u003e[LANG-762] Handle or document ReflectionToStringBuilder\r\n *      and ToStringBuilder for collections that are not thread safe\u003c/a\u003e\r\n * @since 3.1\r\n * @version $Id$\r\n "
    },
    {
      "type": "class_interface",
      "name": "CollectionHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.CollectionHolder.CollectionHolder(T)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LIST"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LIST_SIZE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPEAT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testLinkedList()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testArrayList()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testCopyOnWriteArrayList()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testConcurrency(org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.CollectionHolder\u003cjava.util.List\u003cjava.lang.Integer\u003e\u003e)",
      "begin_line": 84,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 53)",
        "(line 88,col 9)-(line 88,col 26)",
        "(line 90,col 9)-(line 90,col 75)",
        "(line 92,col 9)-(line 100,col 10)",
        "(line 101,col 9)-(line 101,col 81)",
        "(line 102,col 9)-(line 102,col 28)",
        "(line 103,col 9)-(line 103,col 28)",
        "(line 104,col 9)-(line 104,col 74)",
        "(line 105,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.Anonymous-567ecfa0-afda-4aa9-bb46-206fdc9cd515.call()",
      "begin_line": 93,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 94,col 17)-(line 97,col 17)",
        "(line 98,col 17)-(line 98,col 30)"
      ]
    }
  ]
}