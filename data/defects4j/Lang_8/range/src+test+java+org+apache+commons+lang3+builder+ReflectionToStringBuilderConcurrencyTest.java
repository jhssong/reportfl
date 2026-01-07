{
  "filepath": "/tmp/Lang-8b/src/test/java/org/apache/commons/lang3/builder/ReflectionToStringBuilderConcurrencyTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionToStringBuilderConcurrencyTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 120,
      "comment": "\r\n * Tests concurrent access for {@link ReflectionToStringBuilder}.\r\n * \u003cp\u003e\r\n * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We\r\n * want to make sure that we do not get concurrency exceptions accessing this registry.\r\n * \u003c/p\u003e\r\n * \u003cp\u003e\r\n * The tests on the non-thread-safe collections do not pass.\r\n * \u003c/p\u003e\r\n * \r\n * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/LANG-762\"\u003e[LANG-762] Handle or document ReflectionToStringBuilder\r\n *      and ToStringBuilder for collections that are not thread safe\u003c/a\u003e\r\n * @since 3.1\r\n * @version $Id$\r\n "
    },
    {
      "type": "class_interface",
      "name": "CollectionHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.CollectionHolder.CollectionHolder(T)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DATA_SIZE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPEAT"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.testLinkedList()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.testArrayList()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.testCopyOnWriteArrayList()",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.testConcurrency(org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.CollectionHolder\u003cjava.util.List\u003cjava.lang.Integer\u003e\u003e)",
      "begin_line": 82,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 53)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 75)",
        "(line 92,col 9)-(line 101,col 10)",
        "(line 103,col 9)-(line 111,col 10)",
        "(line 112,col 9)-(line 112,col 81)",
        "(line 113,col 9)-(line 113,col 28)",
        "(line 114,col 9)-(line 114,col 28)",
        "(line 115,col 9)-(line 115,col 74)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.Anonymous-c44f2b46-8abc-4d90-9158-8fff9a39af25.call()",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 95,col 17)-(line 98,col 17)",
        "(line 99,col 17)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest.Anonymous-7076aea7-6923-4d59-9c0a-9e96f6e8ef3a.call()",
      "begin_line": 104,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 106,col 17)-(line 108,col 17)",
        "(line 109,col 17)-(line 109,col 30)"
      ]
    }
  ]
}