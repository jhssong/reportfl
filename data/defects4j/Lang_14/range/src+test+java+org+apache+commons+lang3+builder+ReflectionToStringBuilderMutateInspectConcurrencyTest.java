{
  "filepath": "/tmp/Lang-14b/src/test/java/org/apache/commons/lang3/builder/ReflectionToStringBuilderMutateInspectConcurrencyTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionToStringBuilderMutateInspectConcurrencyTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 107,
      "comment": "\r\n * Tests concurrent access for {@link ReflectionToStringBuilder}.\r\n * \u003cp\u003e\r\n * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We\r\n * want to make sure that we do not get concurrency exceptions accessing this registry.\r\n * \u003c/p\u003e\r\n * \r\n * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/LANG-762\"\u003e[LANG-762] Handle or document ReflectionToStringBuilder\r\n *      and ToStringBuilder for collections that are not thread safe\u003c/a\u003e\r\n * @since 3.1\r\n * @version $Id$\r\n "
    },
    {
      "type": "class_interface",
      "name": "TestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listField"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.TestFixture.TestFixture()",
      "begin_line": 45,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 50,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.TestFixture.add()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.TestFixture.delete()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MutatingClient",
      "is_interface": false,
      "parent_types": [
        "java.lang.Runnable"
      ],
      "begin_line": 62,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFixture"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.MutatingClient.MutatingClient(org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.TestFixture)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.MutatingClient.run()",
      "begin_line": 70,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 75,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InspectingClient",
      "is_interface": false,
      "parent_types": [
        "java.lang.Runnable"
      ],
      "begin_line": 79,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFixture"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.InspectingClient.InspectingClient(org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.TestFixture)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.InspectingClient.run()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.testConcurrency()",
      "begin_line": 92,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 52)",
        "(line 96,col 9)-(line 96,col 35)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 105,col 9)"
      ]
    }
  ]
}