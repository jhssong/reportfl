{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/event/EventUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 39,
      "end_line": 267,
      "comment": "\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testConstructor()",
      "begin_line": 42,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 40)",
        "(line 44,col 9)-(line 44,col 75)",
        "(line 45,col 9)-(line 45,col 37)",
        "(line 46,col 9)-(line 46,col 70)",
        "(line 47,col 9)-(line 47,col 79)",
        "(line 48,col 9)-(line 48,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListener()",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 68)",
        "(line 54,col 9)-(line 54,col 88)",
        "(line 55,col 9)-(line 55,col 95)",
        "(line 56,col 9)-(line 56,col 65)",
        "(line 57,col 9)-(line 57,col 81)",
        "(line 58,col 9)-(line 58,col 65)",
        "(line 59,col 9)-(line 59,col 36)",
        "(line 60,col 9)-(line 60,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithNoAddMethod()",
      "begin_line": 63,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 68)",
        "(line 66,col 9)-(line 66,col 88)",
        "(line 67,col 9)-(line 67,col 91)",
        "(line 68,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerThrowsException()",
      "begin_line": 79,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 68)",
        "(line 82,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.Anonymous-bd936e9f-bec6-45be-86df-72e533547e2a.propertyChange(java.beans.PropertyChangeEvent)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithPrivateAddMethod()",
      "begin_line": 100,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 68)",
        "(line 103,col 9)-(line 103,col 88)",
        "(line 104,col 9)-(line 104,col 95)",
        "(line 105,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethod()",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 56)",
        "(line 120,col 9)-(line 120,col 99)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethodWithEvent()",
      "begin_line": 127,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 68)",
        "(line 130,col 9)-(line 130,col 74)",
        "(line 131,col 9)-(line 131,col 99)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.testBindFilteredEventsToMethod()",
      "begin_line": 138,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 66)",
        "(line 141,col 9)-(line 141,col 56)",
        "(line 142,col 9)-(line 142,col 108)",
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 144,col 120)",
        "(line 145,col 9)-(line 145,col 44)",
        "(line 146,col 9)-(line 146,col 120)",
        "(line 147,col 9)-(line 147,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventListener",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 150,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event1(java.beans.PropertyChangeEvent)",
      "begin_line": 152,
      "end_line": 152,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener.event2(java.beans.PropertyChangeEvent)",
      "begin_line": 154,
      "end_line": 154,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "EventCounter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 157,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.eventOccurred()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounter.getCount()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCounterWithEvent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 172,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.eventOccurred(java.beans.PropertyChangeEvent)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCounterWithEvent.getCount()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventCountingInvociationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 188,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventCounts"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.createListener(java.lang.Class\u003cL\u003e)",
      "begin_line": 192,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 196,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.getEventCount(java.lang.String)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 55)",
        "(line 202,col 13)-(line 202,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.EventCountingInvociationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 205,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 62)",
        "(line 209,col 13)-(line 216,col 13)",
        "(line 217,col 13)-(line 217,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipleEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 221,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.MultipleEventSource.addMultipleEventListener(org.apache.commons.lang3.event.EventUtilsTest.MultipleEventListener)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionEventSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 231,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.ExceptionEventSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyChangeSource",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 239,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.setProperty(java.lang.String)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 44)",
        "(line 248,col 13)-(line 248,col 37)",
        "(line 249,col 13)-(line 249,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addVetoableChangeListener(java.beans.VetoableChangeListener)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtilsTest.PropertyChangeSource.removePropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 47)"
      ]
    }
  ]
}