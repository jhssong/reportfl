{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/CharUtilsPerfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharUtilsPerfTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 164,
      "comment": "\n * Tests the difference in performance between CharUtils and CharSet.\n * \n * Sample runs:\n\nNow: Thu Mar 18 14:29:48 PST 2004\nSun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.3.1_10-b03\nSun Microsystems Inc. Java HotSpot(TM) Client VM 1.3.1_10-b03\nWindows XP 5.1 x86 pentium i486 i386\nDo nohting: 0 milliseconds.\nrun_CharUtils_isAsciiNumeric: 4,545 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 3,417 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 85,679 milliseconds.\n\n\nNow: Thu Mar 18 14:24:51 PST 2004\nSun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.4.2_04-b05\nSun Microsystems Inc. Java HotSpot(TM) Client VM 1.4.2_04-b05\nWindows XP 5.1 x86 pentium i486 i386\nDo nohting: 0 milliseconds.\nrun_CharUtils_isAsciiNumeric: 2,578 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 2,477 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 114,429 milliseconds.\n\nNow: Thu Mar 18 14:27:55 PST 2004\nSun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.4.2_04-b05\nSun Microsystems Inc. Java HotSpot(TM) Server VM 1.4.2_04-b05\nWindows XP 5.1 x86 pentium i486 i386\nDo nohting: 0 milliseconds.\nrun_CharUtils_isAsciiNumeric: 630 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 709 milliseconds.\nrun_inlined_CharUtils_isAsciiNumeric: 84,420 milliseconds.\n\n\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VERSION"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WARM_UP"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COUNT"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_SAMPLES"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.main(java.lang.String[])",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.printSysInfo()",
      "begin_line": 77,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 36)",
        "(line 79,col 9)-(line 79,col 71)",
        "(line 80,col 9)-(line 84,col 62)",
        "(line 85,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 96,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run()",
      "begin_line": 99,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 28)",
        "(line 101,col 9)-(line 101,col 19)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 103,col 47)",
        "(line 105,col 9)-(line 105,col 46)",
        "(line 107,col 9)-(line 107,col 43)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 65)",
        "(line 111,col 9)-(line 111,col 54)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 52)",
        "(line 115,col 9)-(line 115,col 73)",
        "(line 117,col 9)-(line 117,col 29)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 121,col 9)-(line 121,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run_CharSet(int)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 18)",
        "(line 126,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run_CharUtils_isAsciiNumeric(int)",
      "begin_line": 136,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 18)",
        "(line 138,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.run_inlined_CharUtils_isAsciiNumeric(int)",
      "begin_line": 148,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 18)",
        "(line 150,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtilsPerfTest.printlnTotal(java.lang.String, long)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 56)",
        "(line 162,col 9)-(line 162,col 104)"
      ]
    }
  ]
}