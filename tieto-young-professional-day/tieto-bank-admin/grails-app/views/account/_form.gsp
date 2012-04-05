<%@ page import="tieto.bank.admin.Account" %>



<div class="fieldcontain ${hasErrors(bean: accountInstance, field: 'balance', 'error')} required">
	<label for="balance">
		<g:message code="account.balance.label" default="Balance" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="balance" required="" value="${fieldValue(bean: accountInstance, field: 'balance')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: accountInstance, field: 'owner', 'error')} required">
	<label for="owner">
		<g:message code="account.owner.label" default="Owner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="owner" name="owner.id" from="${tieto.bank.admin.User.list()}" optionKey="id" required="" value="${accountInstance?.owner?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: accountInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="account.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="type" from="${tieto.bank.admin.AccountType?.values()}" keys="${tieto.bank.admin.AccountType.values()*.name()}" required="" value="${accountInstance?.type?.name()}"/>
</div>

