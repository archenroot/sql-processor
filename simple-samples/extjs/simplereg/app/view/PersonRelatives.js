/*
 * File: app/view/PersonRelatives.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simplereg.view.PersonRelatives', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.personrelatives',

    requires: [
        'Simplereg.view.override.PersonRelatives'
    ],

    frame: true,
    itemId: 'relatives',
    title: 'Relatives',
    store: 'Relatives',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            tools: [
                {
                    xtype: 'tool',
                    itemId: 'reload',
                    type: 'refresh'
                }
            ],
            dockedItems: [
                {
                    xtype: 'toolbar',
                    dock: 'top',
                    items: [
                        {
                            xtype: 'button',
                            itemId: 'create-relative',
                            iconCls: 'icon-add',
                            text: 'Add'
                        },
                        {
                            xtype: 'button',
                            itemId: 'delete-relative',
                            iconCls: 'icon-delete',
                            text: 'Remove'
                        },
                        {
                            xtype: 'button',
                            itemId: 'update-relative',
                            iconCls: 'icon-edit',
                            text: 'Modify'
                        },
                        {
                            xtype: 'button',
                            itemId: 'open',
                            iconCls: 'icon-page',
                            text: 'Open'
                        }
                    ]
                }
            ],
            columns: [
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'id',
                    text: 'Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'personId',
                    text: 'Person Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'version',
                    hideable: false,
                    text: 'Version',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'gridcolumn',
                    sortable: false,
                    dataIndex: 'rtype',
                    text: 'Type',
                    flex: 1
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'relPerson.id',
                    text: 'Rel. Person Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'gridcolumn',
                    sortable: false,
                    dataIndex: 'relPerson.title',
                    text: 'Relative',
                    flex: 2
                },
                {
                    xtype: 'gridcolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'relPerson.firstName',
                    text: 'First Name',
                    flex: 2
                },
                {
                    xtype: 'gridcolumn',
                    hidden: true,
                    dataIndex: 'relPerson.lastName',
                    text: 'Last Name',
                    flex: 2
                },
                {
                    xtype: 'datecolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'relPerson.dateOfBirth',
                    text: 'Date of Birth',
                    flex: 2,
                    format: 'm.d.Y'
                },
                {
                    xtype: 'gridcolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'relPerson.ssn',
                    text: 'SSN',
                    flex: 2
                },
                {
                    xtype: 'gridcolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'relPerson.gender',
                    text: 'Gender',
                    flex: 1
                }
            ]
        });

        me.callParent(arguments);
    }

});