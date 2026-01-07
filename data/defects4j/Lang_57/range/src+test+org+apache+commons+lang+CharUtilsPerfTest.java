{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/CharUtilsPerfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharUtilsPerfTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 165,
      "comment": "\n * Tests the difference in performance between CharUtils and CharSet.\n * \n * Sample runs:\n\nNow: Thu Mar 18 14:29:48 PST 2004\nSun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.3.1_10-b03\nSun Microsystems Inc. Java HotSpot(TM) Client VM 1.3.1_10-b03\nWindows XP 5.1 x86 pentium i486 i386\nDo nohting: 0 milliseconds.\nrun_CharUtils_isAsciiNumeric: 4,545 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 3,417 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 85,679 milliseconds.\n\n\nNow: Thu Mar 18 14:24:51 PST 2004\nSun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.4.2_04-b05\nSun Microsystems Inc. Java HotSpot(TM) Client VM 1.4.2_04-b05\nWindows XP 5.1 x86 pentium i486 i386\nDo nohting: 0 milliseconds.\nrun_CharUtils_isAsciiNumeric: 2,578 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 2,477 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 114,429 milliseconds.\n\nNow: Thu Mar 18 14:27:55 PST 2004\nSun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.4.2_04-b05\nSun Microsystems Inc. Java HotSpot(TM) Server VM 1.4.2_04-b05\nWindows XP 5.1 x86 pentium i486 i386\nDo nohting: 0 milliseconds.\nrun_CharUtils_isAsciiNumeric: 630 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 709 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 84,420 milliseconds.\n\n\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WARM_UP"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COUNT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_SAMPLES"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.main(java.lang.String[])",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.printSysInfo()",
      "begin_line": 78,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)",
        "(line 80,col 9)-(line 80,col 71)",
        "(line 81,col 9)-(line 85,col 62)",
        "(line 86,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 97,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run()",
      "begin_line": 100,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)",
        "(line 102,col 9)-(line 102,col 19)",
        "(line 103,col 9)-(line 103,col 43)",
        "(line 104,col 9)-(line 104,col 47)",
        "(line 106,col 9)-(line 106,col 46)",
        "(line 108,col 9)-(line 108,col 43)",
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 112,col 9)-(line 112,col 54)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 73)",
        "(line 118,col 9)-(line 118,col 29)",
        "(line 120,col 9)-(line 120,col 43)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run_CharSet(int)",
      "begin_line": 125,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 18)",
        "(line 127,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run_CharUtils_isAsciiNumeric(int)",
      "begin_line": 137,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 18)",
        "(line 139,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run_inlined_CharUtils_isAsciiNumeric(int)",
      "begin_line": 149,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 18)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.printlnTotal(java.lang.String, long)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 56)",
        "(line 163,col 9)-(line 163,col 104)"
      ]
    }
  ]
}